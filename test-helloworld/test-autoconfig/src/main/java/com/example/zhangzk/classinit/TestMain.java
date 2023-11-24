/**
 * 
 */
package com.example.zhangzk.classinit;

/**
 * 
 */
public class TestMain {

	public static void main(String[] args) {
		try {
			String className = "com.example.zhangzk.classinit.Sub";
			Class<?> c = Class.forName(className);
			System.out.println(c.getClassLoader().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Class<?> c = Thread.currentThread().getContextClassLoader().loadClass(className);
	 * Class<?> c = Class.forName("com.example.zhangzk.reflect.TestServiceImpl");
	 */

	private static void testClinit() {
		System.out.println("-----class-----");
		System.out.println(">>>subStaticIntVar=" + Sub.subStaticIntVar);
		System.out.println(">>>parentStaticIntVar=" + Sub.parentStaticIntVar);
		System.out.println("-----instance-----");
		Sub s = new Sub();
		s.f();
	}

}
