/**
 * 
 */
package com.example.zhangzk.reflect;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public abstract class AbstractService<T> {
	
	public Map<String,Integer> getMethod11(String key){
		HashMap<String,Integer> ret = new HashMap<String,Integer>();
		ret.put(key, Integer.MAX_VALUE);
		return ret;
	}
	
	public abstract List<Integer> getMethod10(T t);

}
