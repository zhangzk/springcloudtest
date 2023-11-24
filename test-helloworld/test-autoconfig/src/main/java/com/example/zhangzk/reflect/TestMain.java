package com.example.zhangzk.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.Map;

public class TestMain {

	public static void main(String[] args) {
		try {
			//Class<?> c = Class.forName("com.example.zhangzk.reflect.TestServiceImpl");
			
			String className = "com.example.zhangzk.reflect.TestServiceImpl";
			Class<?> c = Thread.currentThread().getContextClassLoader().loadClass(className);
			System.out.println(c.getClassLoader().getName());
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void reflectInfo(Class<?> c)
			throws InstantiationException, IllegalAccessException, InvocationTargetException {
		AnnotatedType[]  annType = c.getAnnotatedInterfaces();
		Annotation[] anns = c.getAnnotations();
		Constructor<?>[] cons = c.getConstructors();
		Method[] m = c.getDeclaredMethods();
		printMethod(m);
		
		Method[] mxx = c.getMethods();
		printMethod(mxx);
		
		//xKse23Bmv9IkNv2
		
		AnnotatedType  superClass = c.getAnnotatedSuperclass();
		Class<?>  cc = c.componentType();
		Annotation[]  kxx = c.getDeclaredAnnotations();
		Field[] ccx = c.getDeclaredFields();
		Class<?>[]  yy = c.getNestMembers();
		Module mm = c.getModule();
		TypeVariable<?>[] kkk = c.getTypeParameters();
		Class<?>  ooo= c.getEnclosingClass();
		Constructor<?> xxy= c.getEnclosingConstructor();
		Method mmz= c.getEnclosingMethod();
		Object[] enConst = c.getEnumConstants();
		

		TestServiceImpl ts = (TestServiceImpl) cons[1].newInstance(0,"zhangzk");
		AbstractService<Integer> as = ts;
		Map<String, Integer> mmp=as.getMethod11("min");
		System.out.println(mmp.get("min"));
		
		System.out.println("end");
	}
	
	static void printMethod(Method[] m) {
		System.out.println("-----------------");
		if( m ==null) {
			System.out.println("method is empty.");
		}
		
		for( Method me : m) {
			System.out.println(me.toString());
		}
		System.out.println("-----------------");
	}

}
