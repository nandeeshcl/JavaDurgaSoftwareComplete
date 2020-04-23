package com.practise.basics;


class Parent 
{
	int a=10;
	int b=20;
	
	Parent(int a)
	{
		System.out.println("Parent constructor");
	}
}

class Child extends Parent 
{
	Child(int a)
	{
		//super(); //by default it will be called, and it should match parameter
		super(10);
		System.out.println("Child constructor");
	}
}
public class ParentChildConstructor {

	public static void main(String[] args) {
		
		Child c=new Child(12);
	}

}
