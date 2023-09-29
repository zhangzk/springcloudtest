/**
 * 
 */
package com.example.zhangzk.ordercenter.web.ao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.zhangzk.ordercenter.client.model.OrderBean;
import com.example.zhangzk.ordercenter.client.service.IOrderService;

/**
 * @author zhangzhaokun
 *
 */
@Component
public class UserAO {
	@Autowired
	private IOrderService orderService;

	public OrderBean getOrderByOrderId(Long orderId) {
		return this.orderService.getOrderByOrderId(orderId);
	}

}
