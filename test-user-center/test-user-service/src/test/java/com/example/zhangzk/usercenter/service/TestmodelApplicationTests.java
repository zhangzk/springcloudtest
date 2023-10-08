package com.example.zhangzk.usercenter.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.zhangzk.usercenter.service.UserService;

@SpringBootTest
class TestmodelApplicationTests {
	private Logger log = LoggerFactory.getLogger(TestmodelApplicationTests.class);
	
	@Autowired
	private UserService userService;

    @Test
    void contextLoads() {
    	try {
    		System.out.println(this.userService.getOrderByOrderId(1L));
    		log.info(">>>orderList size : " + userService.getOrderList(1L, null, null).size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
