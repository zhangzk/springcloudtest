/**
 * 
 */
package com.example.zhangzk.ordercenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zhangzk.ordercenter.client.common.OrderLimit;
import com.example.zhangzk.ordercenter.client.common.OrderSort;
import com.example.zhangzk.ordercenter.client.model.OrderBean;
import com.example.zhangzk.ordercenter.client.service.IOrderService;
import com.example.zhangzk.ordercenter.model.dao.OrderDao;
import com.example.zhangzk.ordercenter.model.mapper.OrderMapper;

/**
 * @author zhangzhaokun
 *
 */
@Service
public class OrderService implements IOrderService {
	
    @Autowired
    private OrderDao orderDao;
    
    @Autowired
    private OrderMapper orderMapper;
    
    public OrderBean getOrderByOrderId(Long orderId) {
    	return orderDao.selectOrderId(orderId);
    }
    
    public List<OrderBean> getOrderList(Long userId,OrderSort orderSort,OrderLimit orderLimit) {
    	return orderMapper.getOrderList(userId, orderSort, orderLimit);
    }

}
