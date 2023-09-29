/**
 * 
 */
package com.example.zhangzk.ordercenter.model;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;

import com.example.zhangzk.ordercenter.client.model.OrderBean;
import com.example.zhangzk.ordercenter.model.dao.OrderDao;

/**
 * @author zhangzhaokun
 *
 */
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) 
@Import(OrderDao.class)
public class OrderDaoTest {
	  @Autowired
	  private OrderDao orderDao;

	  @Test
	  void selectCityByIdTest() {
		  OrderBean city = orderDao.selectOrderId(1L);
		  System.out.println(city);
	 
	  }

}
