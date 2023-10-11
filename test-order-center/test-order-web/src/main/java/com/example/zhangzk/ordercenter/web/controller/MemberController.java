/**
 * 
 */
package com.example.zhangzk.ordercenter.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zhangzk.common.TestResult;
import com.example.zhangzk.ordercenter.web.proxy.MemberServiceProxy;
import com.example.zhangzk.usercenter.client.model.MemberBean;

/**
 * @author zhangzhaokun
 *
 */

@RestController
@RequestMapping("/order")
public class MemberController {
	private Logger log = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberServiceProxy memberServiceProxy;

	@GetMapping("/member/{userId}")
	public MemberBean getFeignOrderUserInfo(@PathVariable("userId") Long userId) {
		TestResult<MemberBean> ret = this.memberServiceProxy.getMemberInfo(userId);
		log.info(ret.toString());
		if (ret.isSuccess()) {
			return ret.getData();
		} else {
			return new MemberBean();
		}
	}

	@GetMapping("/member/add/{userId}")
	public String addMember(@PathVariable("userId") Long userId) {
		MemberBean m = new MemberBean();
		m.setUserId(userId);
		//m.setMemberType(1);
		m.setRemark("remark " + userId);
		TestResult<Void> ret = this.memberServiceProxy.addMember(m);
		
		log.info(ret.toString());
		return ret.toString();
	}

}
