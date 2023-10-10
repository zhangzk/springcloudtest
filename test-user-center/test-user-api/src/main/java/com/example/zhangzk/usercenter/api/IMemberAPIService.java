/**
 * 
 */
package com.example.zhangzk.usercenter.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.zhangzk.common.TestResult;
import com.example.zhangzk.usercenter.client.model.MemberBean;

/**
 * @author zhangzhaokun
 *
 */
public interface IMemberAPIService {

	@GetMapping("/member/get/{userId}")
	public TestResult<MemberBean> getMemberInfo(@PathVariable("userId") Long userId);

	@PostMapping("/member/add")
	public TestResult<Void> addMember(@RequestBody MemberBean member);

	@PostMapping("/member/update")
	public TestResult<Void> updateMember(@RequestBody MemberBean member);
}
