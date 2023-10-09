/**
 * 
 */
package com.example.zhangzk.usercenter.model;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;

import com.example.zhangzk.usercenter.client.model.UserBean;
import com.example.zhangzk.usercenter.model.dao.UserDao;

/**
 * @author zhangzhaokun
 *
 */
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) 
@Import(UserDao.class)
public class UserDaoTest {
	  @Autowired
	  private UserDao userDao;

	  @Test
	  void selectCityByIdTest() {
		  UserBean user = userDao.findByUserId(1L);
		  System.out.println(user.toString());
	 
	  }

}
