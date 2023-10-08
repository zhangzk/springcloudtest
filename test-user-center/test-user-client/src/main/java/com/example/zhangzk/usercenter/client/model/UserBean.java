/**
 * 
 */
package com.example.zhangzk.usercenter.client.model;

import java.util.Date;

import com.example.zhangzk.common.BaseBean;
		

/**
 * @author zhangzhaokun
 *
 */
public class UserBean extends BaseBean {
	private static final long serialVersionUID = -9071472036833640985L;
	private Long orderId;
	private Long userId;
	private Long bookId;
	private Integer orderType;
	private Integer goodsCount;		
	private Date createTime;
	private Date updateTime;
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public Integer getOrderType() {
		return orderType;
	}
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}
	public Integer getGoodsCount() {
		return goodsCount;
	}
	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
