/**
 * 
 */
package com.example.zhangzk.ordercenter.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.zhangzk.ordercenter.client.common.OrderLimit;
import com.example.zhangzk.ordercenter.client.common.OrderSort;
import com.example.zhangzk.ordercenter.client.model.OrderBean;

/**
 * @author zhangzhaokun
 *
 */
@Mapper
public interface OrderMapper {
	List<OrderBean> findByUserId(Long userId,OrderSort orderSort,OrderLimit orderLimit);
	List<OrderBean> getOrderList(Long userId,OrderSort orderSort,OrderLimit orderLimit);
    void save(OrderBean user);

}
