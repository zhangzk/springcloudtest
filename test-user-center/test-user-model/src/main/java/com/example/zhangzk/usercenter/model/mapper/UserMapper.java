/**
 * 
 */
package com.example.zhangzk.usercenter.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.zhangzk.usercenter.client.model.UserBean;

/**
 * @author zhangzhaokun
 *
 */
@Mapper
public interface UserMapper {
	UserBean findByUserId(Long userId);

	UserBean findByNick(String nick);

	UserBean findByEmail(String email);

	UserBean findByPhone(String phone);

	List<UserBean> findByUserIds(List<Long> userIdList);

	void save(UserBean user);

	void update(UserBean user);

}
