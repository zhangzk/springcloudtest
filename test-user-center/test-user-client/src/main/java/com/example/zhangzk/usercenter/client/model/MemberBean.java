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
public class MemberBean extends BaseBean {
	private static final long serialVersionUID = -584723770148727166L;
	private Long userId;
	private Integer memberType;
	private Date firstBuyTime;
	private Date lastBuyTime;
	private Date expireBuyTime;
	private Date firstDiscountTime;
	private Date lastDiscountTime;
	private Date expireTime;
	private String remark;
	private Date createTime;
	private Date updateTime;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getMemberType() {
		return memberType;
	}

	public void setMemberType(Integer memberType) {
		this.memberType = memberType;
	}

	public Date getFirstBuyTime() {
		return firstBuyTime;
	}

	public void setFirstBuyTime(Date firstBuyTime) {
		this.firstBuyTime = firstBuyTime;
	}

	public Date getLastBuyTime() {
		return lastBuyTime;
	}

	public void setLastBuyTime(Date lastBuyTime) {
		this.lastBuyTime = lastBuyTime;
	}

	public Date getExpireBuyTime() {
		return expireBuyTime;
	}

	public void setExpireBuyTime(Date expireBuyTime) {
		this.expireBuyTime = expireBuyTime;
	}

	public Date getFirstDiscountTime() {
		return firstDiscountTime;
	}

	public void setFirstDiscountTime(Date firstDiscountTime) {
		this.firstDiscountTime = firstDiscountTime;
	}

	public Date getLastDiscountTime() {
		return lastDiscountTime;
	}

	public void setLastDiscountTime(Date lastDiscountTime) {
		this.lastDiscountTime = lastDiscountTime;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
