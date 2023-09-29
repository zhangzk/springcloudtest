/**
 * 
 */
package com.example.zhangzk.ordercenter.client.service;

import java.util.List;

import com.example.zhangzk.ordercenter.client.common.OrderLimit;
import com.example.zhangzk.ordercenter.client.common.OrderSort;
import com.example.zhangzk.ordercenter.client.model.OrderBean;

/**
 * @author zhangzhaokun
 *
 */
public interface IOrderService {
    public OrderBean getOrderByOrderId(Long orderId);
    
    public List<OrderBean> getOrderList(Long userId,OrderSort orderSort,OrderLimit orderLimit);

}
