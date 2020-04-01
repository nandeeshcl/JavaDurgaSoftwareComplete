package com.practise.basics;

class Test1   
{
	int a;
	int c;
	
	String d= "sudeep";
	
	Test1()   //Zero arg cont
	{
		a=10;
	}
	
	Test1(int a,int b)   //parameterized contructor
	{
		c=a+b;
	}
	
	public void add()
	{
		System.out.println("Value of a is: "+a);
		System.out.println("Value of c is: "+c);
	}
}

public class ConstructosClass {

	public static void main(String[] args) {
		
		Test1 t1=new Test1();
		Test1 t=new Test1(10,20);
		Test1 t2=new Test1(30,40);
		
		t1.add();
		t2.add();
	    t.add();
	    
	    
	    Test1 t3=new Test1();
	    t3=null;
	    System.out.println(t3.d);
		
		/*System.out.println(t.c);
		System.out.println(t1.a);
		System.out.println(t2.c);*/
		

	}

}
