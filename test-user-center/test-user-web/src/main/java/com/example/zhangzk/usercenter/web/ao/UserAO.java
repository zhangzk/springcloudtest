/**
 * 
 */
package com.example.zhangzk.usercenter.web.ao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.zhangzk.usercenter.client.model.UserBean;
import com.example.zhangzk.usercenter.client.service.IUserService;

/**
 * @author zhangzhaokun
 *
 */
@Component
public class UserAO {
	@Autowired
	private IUserService userService;

	public List<UserBean> findByUserIds(List<Long> userIdList) {
		return this.userService.findByUserIds(userIdList);
	}

	public UserBean findByUserId(Long userId) {
		return this.userService.findByUserId(userId);
	}
}
