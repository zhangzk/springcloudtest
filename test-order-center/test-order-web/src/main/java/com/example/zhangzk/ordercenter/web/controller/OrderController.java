/**
 * 
 */
package com.example.zhangzk.ordercenter.web.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.zhangzk.common.TestResult;
import com.example.zhangzk.ordercenter.client.model.OrderBean;
import com.example.zhangzk.ordercenter.web.ao.UserAO;
import com.example.zhangzk.ordercenter.web.proxy.UserServiceProxy;
import com.example.zhangzk.usercenter.client.dto.UserMemberDTO;
import com.example.zhangzk.usercenter.client.model.MemberBean;
import com.example.zhangzk.usercenter.client.model.UserBean;

/**
 * @author zhangzhaokun
 *
 */

@RestController
@RequestMapping("/order")
public class OrderController {
	private Logger log = LoggerFactory.getLogger(OrderController.class);
	
    @Autowired
	private UserServiceProxy iUserRemoteService;

    @Autowired
    private UserAO userAO;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/tuser/{userId}")
    public UserBean getTOrderUserInfo(@PathVariable("userId") Long userId) {
    	TestResult<UserBean> ret = restTemplate.getForObject("http://test-user-web/user/get?userId=" + userId, TestResult.class);
    	if( ret.getStatus() == 0) {
    		return ret.getData();
    	}else {
    		return new UserBean();
    	}
    }
    
    @GetMapping("/feign/user/{userId}")
    public UserBean getFeignOrderUserInfo(@PathVariable("userId") Long userId) {
    	TestResult<UserBean> ret = this.iUserRemoteService.getUserInfo(userId);
    	if( ret.getStatus() == 0) {
    		return ret.getData();
    	}else {
    		return new UserBean();
    	}
    }
    
    @GetMapping("/user/{userId}")
    public UserBean getOrderUserInfo(@PathVariable("userId") Long userId) {
        //设置Http的Header
        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "zhangzk/test/exchange");

		//设置访问参数
        HashMap<String, Object> params = new HashMap<>();
        params.put("name", "zhangzk");
        
		//设置访问的Entity
        HttpEntity<Object> entity = new HttpEntity<Object>(params, headers);

    	ResponseEntity<TestResult<UserBean>>  resEntity = restTemplate.exchange("http://test-user-web/user/get/{1}",HttpMethod.GET,entity,new ParameterizedTypeReference<TestResult<UserBean>>() {} ,userId);
    	TestResult<UserBean> ret = resEntity.getBody();
    	if( ret.getStatus() == 0) {
    		return ret.getData();
    	}else {
    		return new UserBean();
    	}
    }


    @GetMapping("/get")
    public OrderBean getUserByName(Long orderId) {
        return userAO.getOrderByOrderId(orderId);
    }
    
	@GetMapping("/member/addUserMember/{userId}")
	public UserMemberDTO addUserMember(@PathVariable("userId") Long userId) {
		UserMemberDTO umDTO = new UserMemberDTO();
		
		try {
			MemberBean m = new MemberBean();
			m.setUserId(userId);
			m.setMemberType(1);
			m.setRemark("remark " + userId);
			umDTO.setMember(m);
			
			UserBean u = new UserBean();
			u.setUserId(userId);
			u.setNick("nick" + userId);
			u.setPhone(String.valueOf(13927482039L + userId));
			u.setEmail("hope"+userId + "@hotmail.com");
			u.setRemark("remark"+userId);
			umDTO.setUser(u);
			
			TestResult<Void> result = this.iUserRemoteService.addUserMember(umDTO);
			if(!result.isSuccess()) {
				log.info("add failed. errorMsg=" + result);
			}else {
				log.info("add success.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return umDTO;
	}

}
