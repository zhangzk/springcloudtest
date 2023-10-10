/**
 * 
 */
package com.example.zhangzk.ordercenter.web.controller;

import java.util.HashMap;

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
import com.example.zhangzk.ordercenter.web.proxy.UserRemoteService;
import com.example.zhangzk.usercenter.client.model.UserBean;

/**
 * @author zhangzhaokun
 *
 */

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
	private UserRemoteService userRemoteService;

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
    	TestResult<UserBean> ret = this.userRemoteService.getUserInfo(userId);
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
//	@Autowired
//	private UserService userService;
//    
//    @GetMapping("/get")
//    public OrderBean getUserByName(Long orderId) {
//        System.out.println(userService.getOrderByOrderId(1L)); ;
//        return new OrderBean();
//    }

}
