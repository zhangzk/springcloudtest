/**
 * 
 */
package com.example.zhangzk.ordercenter.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zhangzk.common.TestResult;
import com.example.zhangzk.ordercenter.web.proxy.MemberRemoteService;
import com.example.zhangzk.usercenter.client.model.MemberBean;

/**
 * @author zhangzhaokun
 *
 */

@RestController
@RequestMapping("/order")
public class MemberController {
	@Autowired
	private MemberRemoteService memberRemoteService;

	@GetMapping("/member/{userId}")
	public MemberBean getFeignOrderUserInfo(@PathVariable("userId") Long userId) {
		TestResult<MemberBean> ret = this.memberRemoteService.getMemberInfo(userId);
		if (ret.getStatus() == 0) {
			return ret.getData();
		} else {
			return new MemberBean();
		}
	}

	@GetMapping("/member/add/{userId}")
	public MemberBean addMember(@PathVariable("userId") Long userId) {
		MemberBean m = new MemberBean();
		m.setUserId(userId);
		m.setMemberType(1);
		m.setRemark("remark " + userId);
		this.memberRemoteService.addMember(m);
		return m;
	}

}
