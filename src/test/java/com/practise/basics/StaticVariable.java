package com.practise.basics;

class Static1
{
	static int i=10;
	
	void m()
	{
		//static int a=10;  //ERROR local var cannot be static
	}
	
}
public class StaticVariable {
	
	public static void main(String[] args) {
		
		Static1 s=new Static1 ();
		
		s=null;
		
		System.out.println("Value of i is: "+Static1.i);
		System.out.println("Value of i is: "+s.i);
		
	}

}
