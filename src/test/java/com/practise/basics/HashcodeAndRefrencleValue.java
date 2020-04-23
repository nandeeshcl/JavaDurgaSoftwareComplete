package com.practise.basics;

class H
{
	
}
public class HashcodeAndRefrencleValue {

	public static void main(String[] args) {

		H h1=new H();
		H h2=new H();
		
		System.out.println("Hash code values.........");
		System.out.println("Hash code value of h1 is: "+h1.hashCode());
		System.out.println("Hash code value of h2 is: "+h2.hashCode());
		
		System.out.println();
		
		System.out.println("Refrence values.........");
		System.out.println("Refrence value of h1 is: "+h1.toString());
		System.out.println("Refrence value of h2 is: "+h2.toString());
		
		System.out.println();
		System.out.println(h1.getClass());
		
		H h3=new H();
		System.out.println("Refrence value of h3 is: "+h3);

	}

}
