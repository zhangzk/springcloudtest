/**
 * 
 */
package com.example.zhangzk.common;

/**
 * @author zhangzhaokun
 *
 */
public class TestResult<T> extends BaseBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 默认0表示成功
	 */
	private Integer status = 0;
	private String msg = "SUCCESS";
	private T data;
	
	public boolean isSuccess() {
		return this.status == 0;
	}
	
	public boolean hasData() {
		return this.data == null;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

}
