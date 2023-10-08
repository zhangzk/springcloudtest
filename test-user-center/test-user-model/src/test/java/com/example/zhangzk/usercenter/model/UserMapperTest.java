/**
 * 
 */
package com.example.zhangzk.usercenter.model;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import com.example.zhangzk.usercenter.client.common.UserLimit;
import com.example.zhangzk.usercenter.client.common.UserSort;
import com.example.zhangzk.usercenter.client.model.UserBean;
import com.example.zhangzk.usercenter.model.mapper.UserMapper;

/**
 * @author zhangzhaokun
 *
 */
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) 
public class UserMapperTest {
	  @Autowired
	  private UserMapper userMapper;

	  @Test
	  void findByUserIdTest() {
		  List<UserBean> orders = this.userMapper.findByUserId(1L, UserSort.CREATE_TIME_ASC, UserLimit.LIMIT_0_10);
		  System.out.println(orders.size());
	 
	  }

}
