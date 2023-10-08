/**
 * 
 */
package com.example.zhangzk.usercenter.web.ao;

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

	public UserBean getOrderByOrderId(Long orderId) {
		return this.userService.getOrderByOrderId(orderId);
	}

}
