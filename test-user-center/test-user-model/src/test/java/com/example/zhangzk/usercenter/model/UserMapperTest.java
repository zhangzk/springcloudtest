/**
 * 
 */
package com.example.zhangzk.usercenter.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.util.CollectionUtils;

import com.example.zhangzk.usercenter.client.model.UserBean;
import com.example.zhangzk.usercenter.model.mapper.UserMapper;

/**
 * @author zhangzhaokun
 *
 */
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) 
public class UserMapperTest {
	private Logger log = LoggerFactory.getLogger(UserMapperTest.class);
	
	  @Autowired
	  private UserMapper userMapper;

	  @Test
	  void findByUserIdTest() {
		  List<Long> userIdList = new ArrayList<Long>();
		  userIdList.add(1L);
		  userIdList.add(2L);
		  List<UserBean> userList = this.userMapper.findByUserIds(userIdList);
		  
		  if(CollectionUtils.isEmpty(userList)) {
			  log.info("userList is empty.");
		  }else {
			  userList.forEach(u->log.info(u.toString()));	  
			  
		  }
	  }

}
