package com.example.zhangzk.usercenter.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestmodelApplicationTests {
	private Logger log = LoggerFactory.getLogger(TestmodelApplicationTests.class);

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
		try {
			System.out.println(this.userService.findByUserId(1L));
			List<Long> userIdList = new ArrayList<Long>();
			userIdList.add(1L);
			userIdList.add(2L);
			log.info(">>>orderList size : " + userService.findByUserIds(userIdList));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
