package com.practise.basics;

public class InstanceFactoryMethod {

	public static void main(String[] args) {
		
		FactoryF f=new FactoryF();
		
		
		FactoryF f1 = f.getRef();
		FactoryF f2 = f.getRef();

		System.out.println(f1);
		System.out.println(f2);

		//f1.m1(); // can call instance method

	}

}

class FactoryF {
	
	//public FactoryF f ;

	/*FactoryF() {
		
		System.out.println("I am a Factory constructor");
	}*/

	// Factory method: returns object
	FactoryF getRef() {
		
			//f = new FactoryF();
			
			return this; // any number of time u call this it will return single ref var
		

		
	}

	/*void m1() {
		System.out.println("I am m1 method...");
	}*/
}
