/**
 * 
 */
package com.example.zhangzk.usercenter.client.service;

import java.util.List;

import com.example.zhangzk.usercenter.client.model.UserBean;

/**
 * @author zhangzhaokun
 *
 */
public interface IUserService {
    public UserBean findByUserId(Long userId);
    
    public List<UserBean> findByUserIds(List<Long> userIdList);

}
