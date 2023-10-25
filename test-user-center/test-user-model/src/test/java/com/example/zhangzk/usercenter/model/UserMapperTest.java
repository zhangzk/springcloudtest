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
import org.springframework.test.annotation.Commit;
import org.springframework.util.CollectionUtils;

import com.example.zhangzk.usercenter.client.model.UserBean;
import com.example.zhangzk.usercenter.model.mapper.UserMapper;

/**
 * 单元测试的代码会自动回滚事务，可以直接在方法上加上 @Rollback(false) 或者 @Commit ，这样事务就不会回滚了
 * @author zhangzhaokun
 */
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) 
public class UserMapperTest {
	private Logger log = LoggerFactory.getLogger(UserMapperTest.class);
	
	  @Autowired
	  private UserMapper userMapper;
	  
	  @Test
	  void findByEmail() {
		  UserBean user = this.userMapper.findByEmail("hope29@hotmail.com");
		  
		  log.info(user.toString());
	  }

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
	  
	  @Test
	  @Commit
	  void saveTest() {
		  UserBean u = new UserBean();
		  u.setEmail("13590343576@139.com");
		  u.setPhone("13316822611");
		  u.setNick("nick"+System.currentTimeMillis());
		  u.setRemark("zhangzk test");
		  this.userMapper.save(u);
	  }

}
