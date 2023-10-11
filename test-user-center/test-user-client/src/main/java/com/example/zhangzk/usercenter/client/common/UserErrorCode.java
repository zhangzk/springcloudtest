package com.example.zhangzk.usercenter.client.common;

public enum UserErrorCode {
	SUCCESS(0,"SUCCESS"),
	ILLEGAL_ARGUMENTS(1001000,"illegalArguments"),

	
	
	;
	
	private int errorCode;
	private String errorMsg;
	
	UserErrorCode(int errorCode,String errorMsg){
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public int getErrorCode() {
		return this.errorCode;
	}
	
	public String getErrorMsg() {
		return this.errorMsg;
	}
	

}
