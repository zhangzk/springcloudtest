/**
 * 
 */
package com.example.zhangzk.usercenter.model;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.util.CollectionUtils;

import com.example.zhangzk.usercenter.client.model.MemberBean;
import com.example.zhangzk.usercenter.model.mapper.MemberMapper;

/**
 * 单元测试的代码会自动回滚事务，可以直接在方法上加上 @Rollback(false) 或者 @Commit ，这样事务就不会回滚了
 * @author zhangzhaokun
 *
 */
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) 
public class MemberMapperTest {
	private Logger log = LoggerFactory.getLogger(MemberMapperTest.class);
	
	  @Autowired
	  private MemberMapper memberMapper;

	  @Test
	  void findByUserIdTest() {
		  List<Long> userIdList = new ArrayList<Long>();
		  userIdList.add(1L);
		  userIdList.add(2L);
		  List<MemberBean> userList = this.memberMapper.findByUserIds(userIdList);
		  
		  if(CollectionUtils.isEmpty(userList)) {
			  log.info("userList is empty.");
		  }else {
			  userList.forEach(u->log.info(u.toString()));	  
			  
		  }
	  }
	  
	  @Test
	  void updateTest() {
		  List<Long> userIdList = new ArrayList<Long>();
		  userIdList.add(1L);
		  userIdList.add(2L);
		  List<MemberBean> memberList = this.memberMapper.findByUserIds(userIdList);
		  
		  if(CollectionUtils.isEmpty(memberList)) {
			  log.info("userList is empty.");
		  }else {
			  memberList.forEach(u->log.info(u.toString()));	
			  Calendar c = Calendar.getInstance();
			  c.set(2025, 10, 10, 0, 0, 0);
				memberList.forEach(m -> {
					m.setFirstDiscountTime(c.getTime());
					m.setRemark("zhangzk");
					log.info(m.toString());
					this.memberMapper.update(m);
				});
 
		  }
	  }
	  
	  @Test
	  void saveTest() {

		  Calendar c = Calendar.getInstance();
		  c.set(2025, 10, 10, 0, 0, 0);
		  
		  MemberBean m = new MemberBean();
		  m.setFirstBuyTime(Calendar.getInstance().getTime());
		  m.setExpireBuyTime(Calendar.getInstance().getTime());
		  m.setExpireTime(c.getTime());
		  m.setFirstDiscountTime(Calendar.getInstance().getTime());
		  m.setLastBuyTime(Calendar.getInstance().getTime());
		  m.setLastDiscountTime(Calendar.getInstance().getTime());
		  m.setRemark("zhangzk");
		  m.setUserId(4L);
		  m.setMemberType(1);
		  
		  
		  this.memberMapper.save(m);
		  
	  }

}
