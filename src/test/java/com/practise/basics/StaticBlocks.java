package com.practise.basics;

class Sta
{
	int a;
	
	static int x=10;
	static 
	{
		System.out.println("Static block...");
		//static int a=99;  local va rcannot be static
		
		//a=66;  cannot contain instance var
		
		//create object to calll ins member
		Sta s1=new Sta();
		
		s1.m1();
		
		System.out.println("Value of x is: "+x);
		
		// this;  cannot use this inside static block
		
	}
	
	
	void m1()
	{
		System.out.println("Instanc method...");
	}
}
public class StaticBlocks {

	public static void main(String[] args) {
		
		Sta s=new Sta();
		
		

	}

}
