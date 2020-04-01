package com.practise.basics;

public class InstanceContext {

	public static void main(String[] args) {
		
		InstanceCon i=new InstanceCon();
		
		System.out.println(i.a);
		i.m1();

	}

}

class InstanceCon
{
	{
		System.out.println("Instance block");
	}
	
	public void m1()
	{
		System.out.println("method m1");
	}
	
	int a=10;
	
}
