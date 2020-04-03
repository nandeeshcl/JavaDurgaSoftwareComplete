package com.practise.basics;

public class ClasswithoutmainMethod {
	
	
	
	/*static 
	{
		System.out.println("I am a static block");
		System.exit(0);
	}*/
	
	
	//Java 6 version
	/*static int a=m1();
	
	static int  m1()
	{
		System.out.println("Hai");
		System.exit(0);
		return  10;
	}*/
	
	static Object obj=new Object()
			{
		{
			System.out.println("Main method");
		}
			};
	

}
