/**
 * 
 */
package com.example.zhangzk.ordercenter.model;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import com.example.zhangzk.ordercenter.client.common.OrderLimit;
import com.example.zhangzk.ordercenter.client.common.OrderSort;
import com.example.zhangzk.ordercenter.client.model.OrderBean;
import com.example.zhangzk.ordercenter.model.mapper.OrderMapper;

/**
 * @author zhangzhaokun
 *
 */
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) 
public class OrderMapperTest {
	  @Autowired
	  private OrderMapper orderMapper;

	  @Test
	  void findByUserIdTest() {
		  List<OrderBean> orders = this.orderMapper.findByUserId(1L, OrderSort.CREATE_TIME_ASC, OrderLimit.LIMIT_0_10);
		  System.out.println(orders.size());
	 
	  }

}
