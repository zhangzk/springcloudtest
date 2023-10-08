/**
 * 
 */
package com.example.zhangzk.usercenter.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.zhangzk.usercenter.client.common.UserLimit;
import com.example.zhangzk.usercenter.client.common.UserSort;
import com.example.zhangzk.usercenter.client.model.UserBean;

/**
 * @author zhangzhaokun
 *
 */
@Mapper
public interface UserMapper {
	List<UserBean> findByUserId(Long userId,UserSort orderSort,UserLimit orderLimit);
	List<UserBean> getOrderList(Long userId,UserSort orderSort,UserLimit orderLimit);
    void save(UserBean user);

}
