package com.example.zhangzk.classinit;

public class Sub extends Parent {
	static {
		System.out.println("Sub static block 1.");
		subStaticIntVar = 3;
	}
	
	static Integer subStaticIntVar = 2;
	
	static {
		System.out.println("Sub static block 2.");
		System.out.println("subStaticIntVar=" + subStaticIntVar);
		subStaticIntVar = 4;
	}
	
	{
		System.out.println("Sub not static block 1.");
		subIntVar = 30;
	}
	
	Integer subIntVar = 20;
	
	public Sub(){	
		System.out.println("Sub construct  method .");
		System.out.println("subIntVar=" + subIntVar);
	}
	
	public void f(){
		System.out.println("Sub f().");
	}
	
	
	{
		System.out.println("Sub not static block 2.");
		subIntVar = 40;
	}

}
