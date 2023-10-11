/**
 * 
 */
package com.example.zhangzk.usercenter.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zhangzk.common.TestResult;
import com.example.zhangzk.usercenter.api.IMemberAPIService;
import com.example.zhangzk.usercenter.client.model.MemberBean;
import com.example.zhangzk.usercenter.service.MemberService;

/**
 * @author zhangzhaokun
 *
 */

@RestController
@RequestMapping("/user")
public class MemberController implements IMemberAPIService {
	private Logger log = LoggerFactory.getLogger(MemberController.class);

    
    @Autowired
    private MemberService memberService;


    public TestResult<MemberBean> getMemberInfo(@PathVariable("userId") Long userId) {
    	log.info("request,userId=" + userId);
    	TestResult<MemberBean> result = new TestResult<MemberBean>();
    	MemberBean user = this.memberService.findByUserId(userId);
        result.setStatus(0);
        result.setMsg("SUCCESS");
        result.setData(user);
        return result;
    }
    
 
    public TestResult<Void> addMember(@RequestBody MemberBean member) {
    	log.info("post request," + member);
    	try {
			Thread.sleep(22000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return this.memberService.addMember(member);
    	
    }
    
    public TestResult<Void> updateMember(@RequestBody MemberBean member) {
    	log.info("post request," + member);
    	return this.memberService.updateMember(member);
    }
}
