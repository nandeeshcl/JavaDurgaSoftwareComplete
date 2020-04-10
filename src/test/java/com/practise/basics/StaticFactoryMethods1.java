package com.practise.basics;

public class StaticFactoryMethods1 {

	public static void main(String[] args) {
		
		Factory f1=Factory.getRef();
		Factory f2=Factory.getRef();
		
		System.out.println(f1);
		System.out.println(f2);
		
		f1.m1();  //can call instance method

	}

}


//Single ton calss
class Factory
{
	public static Factory f=null;
	
	private Factory()
	{
		System.out.println("I am a Factory constructor");
	}
	
	//Factory method: returns object
	static Factory getRef()
	{
		if(f==null)
		{
			f=new Factory();
		}
		
		return f;   //any number of time u call this it will return single ref var
	}
	
	void m1()
	{
		System.out.println("I am m1 method...");
	}
}
