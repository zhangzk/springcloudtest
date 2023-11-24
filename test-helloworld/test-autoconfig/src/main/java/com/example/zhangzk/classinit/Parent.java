package com.example.zhangzk.classinit;

public class Parent {
	static {
		System.out.println("Parent static block 1.");
		parentStaticIntVar = 3;
	}
	
	static Integer parentStaticIntVar = 2;
	
	static {
		System.out.println("Parent static block 2.");
		System.out.println("parentStaticIntVar=" + parentStaticIntVar);
		parentStaticIntVar = 4;
	}
	
	{
		System.out.println("Parent not static block 1.");
		parentIntVar = 30;
	}
	
	Integer parentIntVar = 20;
	
	public Parent(){	
		System.out.println("Parent construct  method .");
		System.out.println("parentIntVar=" + parentIntVar);
	}
	
	public void f(){
		System.out.println("parent f().");
	}
	
	
	{
		System.out.println("Parent not static block 2.");
		parentIntVar = 40;
	}

}
