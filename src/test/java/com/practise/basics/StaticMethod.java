package com.practise.basics;


class StaticM
{
	static int a=10;
	int f;
	
	
	static void m1()
	{
		//f=20; //  Instance var not allowed in static method
		//static int i=33;  Local var cannot be static 
		System.out.println("static method");
		
		//to acesss instance method we need to create obj for a class and call it using new ref var
		StaticM x=new StaticM();
		
		x.m2();
		
		//System.out.println(f);
		
		//int a=10;
	
		
	}
	
	void m2()
	{
		//this.m1();
		m1();
		System.out.println("instance method");
		
		
	}
	
	static
	{
		//static int a=99;
		
		int a=99;
		
		/*void st()
		{
			System.out.println("asdad");
		}*/
	}
	
	
	
}
public class StaticMethod {

	public static void main(String[] args) {
		
		
		
		StaticM m =new StaticM();
		
		System.out.println("Value of a is: "+m.a);
		System.out.println("Value of a is: "+StaticM.a);
		
		//m=null;  null pointer exception if we call instance method with ref var having null values
		
		m.m1();
		m.m2();
		

	}

}
