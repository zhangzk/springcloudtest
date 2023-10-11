/**
 * 
 */
package com.example.zhangzk.usercenter.client.dto;

import com.example.zhangzk.usercenter.client.model.MemberBean;
import com.example.zhangzk.usercenter.client.model.UserBean;

/**
 * @author zhangzhaokun
 *
 */
public class UserMemberDTO {
	private UserBean user;
	private MemberBean member;

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public MemberBean getMember() {
		return member;
	}

	public void setMember(MemberBean member) {
		this.member = member;
	}

}
