package com.practise.basics;


interface I
{
	int x=10;  //public static final
	int y=20;
	void m1();   //cannot be static 
	void m2();
	
}

class A1 implements I
{

	
	public  void m1() {
		System.out.println("method m1");
		System.out.println("Value of x is: "+x);
		
	}

	
	public void m2() {
		System.out.println("method m2");
		System.out.println("Value of y is: "+y);
		
	}
	
}
public class InterfaceClass {

	public static void main(String[] args) {
		
		A1 a=new A1();
		a.m1();
		a.m2();
		
		// I.y=20;
		System.out.println("new value of x is: "+I.x);

	}

}
