/**
 * 
 */
package com.example.zhangzk.usercenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zhangzk.usercenter.client.model.UserBean;
import com.example.zhangzk.usercenter.client.service.IUserService;
import com.example.zhangzk.usercenter.model.dao.UserDao;
import com.example.zhangzk.usercenter.model.mapper.UserMapper;

/**
 * @author zhangzhaokun
 *
 */
@Service
public class UserService implements IUserService {
	
    @Autowired
    private UserDao userDao;
    
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
    


}
