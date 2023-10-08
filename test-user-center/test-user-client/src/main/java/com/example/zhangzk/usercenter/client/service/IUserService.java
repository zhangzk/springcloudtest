/**
 * 
 */
package com.example.zhangzk.usercenter.client.service;

import java.util.List;

import com.example.zhangzk.usercenter.client.common.UserLimit;
import com.example.zhangzk.usercenter.client.common.UserSort;
import com.example.zhangzk.usercenter.client.model.UserBean;

/**
 * @author zhangzhaokun
 *
 */
public interface IUserService {
    public UserBean getOrderByOrderId(Long orderId);
    
    public List<UserBean> getOrderList(Long userId,UserSort userSort,UserLimit userLimit);

}
