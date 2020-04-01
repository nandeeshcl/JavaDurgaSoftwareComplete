package com.practise.basics;

public class ObjectCreation {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		
		System.out.println("Value of a is: "+d1.a);
		System.out.println("Value of b is: "+d1.b);
		System.out.println("Value of c is: "+d1.c);
		System.out.println("Value of s is: "+Demo.s);
		
		System.out.println();
		
		Demo d2=new Demo();
		
		System.out.println("Value of a is: "+d2.a);
		System.out.println("Value of b is: "+d2.b);
		System.out.println("Value of c is: "+d2.c);
		System.out.println("Value of s is: "+d2.s);
		

	}

}


class Demo
{
	int a=10;
	float b=20.22f;
	char c='x';
	
	static int s=22;
	
}
