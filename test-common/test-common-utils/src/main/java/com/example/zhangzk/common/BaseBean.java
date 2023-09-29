/**
 * 
 */
package com.example.zhangzk.common;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author zhangzhaokun
 *
 */
public class BaseBean implements java.io.Serializable {
	
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	

}
