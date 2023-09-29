/**
 * 
 */
package com.example.zhangzk.ordercenter.model.dao;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.example.zhangzk.ordercenter.client.model.OrderBean;

/**
 * @author zhangzhaokun
 *
 */
@Component
public class OrderDao {
	private Logger log = LoggerFactory.getLogger(OrderDao.class);

	private final SqlSession sqlSession;

	public OrderDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public OrderBean selectOrderId(long orderId) {
		log.info("orderId=" + orderId);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("orderId", orderId);
		return this.sqlSession.selectOne("findByOrderId", params);
	}

}
