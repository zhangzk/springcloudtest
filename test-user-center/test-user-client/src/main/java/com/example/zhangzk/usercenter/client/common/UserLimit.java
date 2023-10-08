/**
 * 
 */
package com.example.zhangzk.usercenter.client.common;

/**
 * @author zhangzhaokun
 *
 */
public enum UserLimit {
	LIMIT_0_1(0,1),
	LIMIT_0_10(0,10),	
	LIMIT_0_20(0,20),
	LIMIT_0_30(0,30),
	LIMIT_0_50(0,50),
	LIMIT_0_100(0,100),	
	;
	
	private Integer start;
	private Integer limit;


	UserLimit(int start,int limit) {
		this.start = start;
		this.limit = limit;
	}
	
	
	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

}
