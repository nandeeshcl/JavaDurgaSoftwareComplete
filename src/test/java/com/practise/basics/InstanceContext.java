package com.practise.basics;

public class InstanceContext {

	public static void main(String[] args) {
		
		InstanceCon i=new InstanceCon();
		
		//int f=i.m1();
		
		/*System.out.println(i.a);
		i.m1();*/

	}

}

class InstanceCon
{
	{
		System.out.println("Instance block");
	}
	
	public int m1()
	{
		System.out.println("method m1");
		return 10;
	}
	
	int a=m1();
	
	public InstanceCon()
	{
		System.out.println("Instance constructor");
	}
	
}
