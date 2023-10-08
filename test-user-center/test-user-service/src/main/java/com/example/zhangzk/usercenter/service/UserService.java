/**
 * 
 */
package com.example.zhangzk.usercenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zhangzk.usercenter.client.common.UserLimit;
import com.example.zhangzk.usercenter.client.common.UserSort;
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
    
    public UserBean getOrderByOrderId(Long orderId) {
    	return userDao.selectOrderId(orderId);
    }
    
    public List<UserBean> getOrderList(Long userId,UserSort userSort,UserLimit userLimit) {
    	return userMapper.getOrderList(userId, userSort, userLimit);
    }

}
