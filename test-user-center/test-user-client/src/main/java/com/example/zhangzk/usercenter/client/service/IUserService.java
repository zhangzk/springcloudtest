/**
 * 
 */
package com.example.zhangzk.usercenter.client.service;

import java.util.List;

import com.example.zhangzk.common.TestResult;
import com.example.zhangzk.usercenter.client.model.UserBean;

/**
 * @author zhangzhaokun
 *
 */
public interface IUserService {

	public UserBean findByNick(String nick);

	public UserBean findByEmail(String email);

	public UserBean findByPhone(String phone);

	public UserBean findByUserId(Long userId);

	public List<UserBean> findByUserIds(List<Long> userIdList);

	public TestResult<Void> addUser(UserBean user);

	public TestResult<Void> updateUser(UserBean user);

}
