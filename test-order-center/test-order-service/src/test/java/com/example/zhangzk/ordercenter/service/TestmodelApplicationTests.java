package com.example.zhangzk.ordercenter.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestmodelApplicationTests {
	private Logger log = LoggerFactory.getLogger(TestmodelApplicationTests.class);
	
	@Autowired
	private OrderService orderService;

    @Test
    void contextLoads() {
    	try {
    		System.out.println(this.orderService.getOrderByOrderId(1L));
    		log.info(">>>orderList size : " + orderService.getOrderList(1L, null, null).size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
