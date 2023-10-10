/**
 * 
 */
package com.example.zhangzk.usercenter.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.zhangzk.common.TestResult;
import com.example.zhangzk.usercenter.client.model.UserBean;
import com.example.zhangzk.usercenter.client.service.IUserService;
import com.example.zhangzk.usercenter.model.mapper.UserMapper;

/**
 * @author zhangzhaokun
 *
 */
@Service
public class UserService implements IUserService {
	private Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserBean findByUserId(Long userId) {
		// TODO Auto-generated method stub
		return userMapper.findByUserId(userId);
	}

	@Override
	public List<UserBean> findByUserIds(List<Long> userIdList) {
		// TODO Auto-generated method stub
		return userMapper.findByUserIds(userIdList);
	}

	@Override
	public UserBean findByNick(String nick) {
		// TODO Auto-generated method stub
		return userMapper.findByNick(nick);
	}

	@Override
	public UserBean findByEmail(String email) {
		// TODO Auto-generated method stub
		return userMapper.findByEmail(email);
	}

	@Override
	public UserBean findByPhone(String phone) {
		// TODO Auto-generated method stub
		return userMapper.findByPhone(phone);
	}

	public TestResult<Void> addUser(UserBean user) {
		log.info("post request," + user);
		TestResult<Void> result = new TestResult<Void>();

		// 参数为空
		if (user == null) {
			result.setStatus(1);
			result.setMsg("EMAIL existed.");
			return result;
		}

		// 检查必填字段
		if (StringUtils.hasLength(user.getEmail()) || StringUtils.hasLength(user.getNick())
				|| StringUtils.hasLength(user.getPhone())) {
			result.setStatus(1);
			result.setMsg("EMAIL or NICK or PHONE is empty.");
			return result;
		}

		// 检查email重复
		if (this.userMapper.findByEmail(user.getEmail()) != null) {
			result.setStatus(1);
			result.setMsg("EMAIL existed.");
			return result;
		}

		// 检查nick重复
		if (this.userMapper.findByNick(user.getNick()) != null) {
			result.setStatus(1);
			result.setMsg("NICK existed.");
			return result;
		}

		// 检查phone重复
		if (this.userMapper.findByPhone(user.getPhone()) != null) {
			result.setStatus(1);
			result.setMsg("PHONE existed.");
			return result;
		}

		userMapper.save(user);
		result.setStatus(0);
		result.setMsg("SUCCESS");
		return result;
	}

	public TestResult<Void> updateUser(UserBean user) {
		log.info("post request," + user);
		TestResult<Void> result = new TestResult<Void>();

		// 参数为空
		if (user == null) {
			result.setStatus(1);
			result.setMsg("EMAIL existed.");
			return result;
		}

		// 检查必填字段
		if (StringUtils.hasLength(user.getEmail()) || StringUtils.hasLength(user.getNick())
				|| StringUtils.hasLength(user.getPhone())) {
			result.setStatus(1);
			result.setMsg("EMAIL or NICK or PHONE is empty.");
			return result;
		}

		UserBean dbUser = this.userMapper.findByUserId(user.getUserId());
		if (dbUser == null) {
			result.setStatus(1);
			result.setMsg("Cant not found user in database,user_id=" + user.getUserId());
			return result;
		}

		boolean isUpdateEmail = false;
		if (!dbUser.getEmail().equals(user.getEmail())) {
			isUpdateEmail = true;
		}

		// 检查email重复
		if (isUpdateEmail && this.userMapper.findByEmail(user.getEmail()) != null) {
			result.setStatus(1);
			result.setMsg("EMAIL existed.");
			return result;
		}

		boolean isUpdateNick = false;
		if (!dbUser.getNick().equals(user.getNick())) {
			isUpdateNick = true;
		}

		// 检查nick重复
		if (isUpdateNick && this.userMapper.findByNick(user.getNick()) != null) {
			result.setStatus(1);
			result.setMsg("NICK existed.");
			return result;
		}

		boolean isUpdatePhone = false;
		if (!dbUser.getPhone().equals(user.getEmail())) {
			isUpdatePhone = true;
		}

		// 检查phone重复
		if (isUpdatePhone && this.userMapper.findByPhone(user.getPhone()) != null) {
			result.setStatus(1);
			result.setMsg("PHONE existed.");
			return result;
		}

		this.userMapper.update(user);
		result.setStatus(0);
		result.setMsg("SUCCESS");
		return result;
	}

}
