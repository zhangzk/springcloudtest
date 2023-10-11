/**
 * 
 */
package com.example.zhangzk.ordercenter.web.fallback;

import org.springframework.stereotype.Component;

import com.example.zhangzk.common.TestResult;
import com.example.zhangzk.ordercenter.web.proxy.UserServiceProxy;
import com.example.zhangzk.usercenter.client.dto.UserMemberDTO;
import com.example.zhangzk.usercenter.client.model.MemberBean;
import com.example.zhangzk.usercenter.client.model.UserBean;

import feign.Request.Options;

/**
 * @author zhangzhaokun
 *
 */
@Component
public class UserServiceFallback implements UserServiceProxy {

	@Override
	public TestResult<MemberBean> getMemberInfo(Long userId) {
		TestResult<MemberBean> tr = new TestResult<MemberBean>();
		tr.setMsg("UserServiceFallback");
		return tr;
	}

	@Override
	public TestResult<Void> addMember(MemberBean member) {
		TestResult<Void> tr = new TestResult<Void>();
		tr.setStatus(-100);
		tr.setMsg("UserServiceFallback");
		return tr;
	}

	@Override
	public TestResult<Void> updateMember(MemberBean member) {
		TestResult<Void> tr = new TestResult<Void>();
		tr.setStatus(-100);
		tr.setMsg("UserServiceFallback");
		return tr;
	}

	@Override
	public TestResult<UserBean> getUserInfo(Long userId) {
		TestResult<UserBean> tr = new TestResult<UserBean>();
		tr.setStatus(-100);
		tr.setMsg("UserServiceFallback");
		return tr;
	}

	@Override
	public TestResult<UserBean> getUserInfo(Options options, Long userId) {
		TestResult<UserBean> tr = new TestResult<UserBean>();
		tr.setStatus(-100);
		tr.setMsg("UserServiceFallback");
		return tr;
	}

	@Override
	public TestResult<Void> addUser(UserBean user) {
		TestResult<Void> tr = new TestResult<Void>();
		tr.setStatus(-100);
		tr.setMsg("UserServiceFallback");
		return tr;
	}

	@Override
	public TestResult<Void> updateUser(UserBean user) {
		TestResult<Void> tr = new TestResult<Void>();
		tr.setStatus(-100);
		tr.setMsg("UserServiceFallback");
		return tr;
	}

	@Override
	public TestResult<Void> addUserMember(UserMemberDTO utDTO) {
		TestResult<Void> tr = new TestResult<Void>();
		tr.setStatus(-100);
		tr.setMsg("UserServiceFallback");
		return tr;
	}

}
