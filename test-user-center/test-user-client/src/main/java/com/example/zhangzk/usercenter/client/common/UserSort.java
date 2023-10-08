/**
 * 
 */
package com.example.zhangzk.usercenter.client.common;

/**
 * @author zhangzhaokun
 *
 */
public enum UserSort {
	
	CREATE_TIME_ASC("create_time",true),
	CREATE_TIME_DESC("create_time",false),
	UPDATE_TIME_ASC("update_time",true),
	UPDATE_TIME_DESC("update_time",false),
	
	
	;
	private String fieldName;
	private String sort;


	UserSort(String fieldName,boolean isAsc){
		this.fieldName = fieldName;
		this.sort = isAsc?"asc":"desc";
	}
	
	public String getFieldName() {
		return fieldName;
	}


	public String getSort() {
		return sort;
	}

}
