package com.practise.basics;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4};
		System.out.println("Array size is: "+a.length);
		
		
		//used to retrieve element from Arrays and Collections
		for(int i:a)
		{
			System.out.println("Element is: "+i);
		}

	}

}
