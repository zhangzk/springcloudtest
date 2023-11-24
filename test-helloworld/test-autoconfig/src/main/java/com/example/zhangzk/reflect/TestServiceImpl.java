package com.example.zhangzk.reflect;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.zhangzk.IdProperties;

@Component
@Configuration
public class TestServiceImpl extends AbstractService<Integer> implements TestService {

	@Nullable
	private Integer uid = 10000;
	@Nullable
	private String name;
	
	private int uid2= uid;
	
	private IdProperties idProperties;
	
	
	
	public static int sId=2;
	public static int sId2=sId;
	
	public static final String VERSION = "ZHANGZK";
	
	
	static {
		System.out.println("静态代码块start： sId=" + sId + ";sId2=" + sId2);
		
		sId=1;
		
		System.out.println("静态代码块end： sId=" + sId+ ";sId2=" + sId2);
	}

	public TestServiceImpl(Integer uid, String name) {
		System.out.println("构造函数开始：uid=" + uid + ";this.uid=" + this.uid +  ";uid2=" + uid2);
		
		this.uid = uid;
		this.name = name;
	}

	public TestServiceImpl() {
		this.uid = 1;
		this.name = "zhangzk";

	}
	
     {
		System.out.println("非静态代码块start： uid=" + uid + ";uid2=" + uid2);
		
		uid=100;
		
		System.out.println("非静态代码块end： uid=" + uid+ ";uid2=" + uid2);
	}
     
 	public Map<String,Integer> getMethod11(String key){
		HashMap<String,Integer> ret = new HashMap<String,Integer>();
		ret.put(key, Integer.MIN_VALUE);
		return ret;
	}
	
	
	public IdProperties getMethod3() {
		return idProperties;
	}

	@Override
	public int getMethod1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> getMethod2(String name, Integer uid) {
		// TODO Auto-generated method stub
		
		return Collections.emptyList();
	}

	@Override
	public List<Integer> getMethod10(Integer t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public static AbstractService<Integer> getMethod7(String key) {
		return null;
		
	}
	
	
	
	class InnerTestClass1{
		private Integer id;
		private String name;
		
		public Integer getId() {
			return 0;
		}
	}
	
	
	static class InnerTestClass2{
		private Integer id;
		private String name;
		
		public Integer getId() {
			return 0;
		}
	}	
	

}
