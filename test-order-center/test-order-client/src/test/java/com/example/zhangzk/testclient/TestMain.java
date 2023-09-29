/**
 * 
 */
package com.example.zhangzk.testclient;

import com.example.zhangzk.ordercenter.client.model.OrderBean;

/**
 * @author zhangzhaokun
 *
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderBean order = new OrderBean();
		order.setBookId(1377L);
		order.setUserId(18284805L);
		order.setOrderId(System.currentTimeMillis());
		order.setOrderType(101);
		order.setGoodsCount(100);
		order.setCreateTime(java.util.Calendar.getInstance().getTime());
		order.setUpdateTime(java.util.Calendar.getInstance().getTime());
		System.out.println(order);

	}

}
