package com.practise.basics;

class Sum {
	

	public void sum(int... a) {
		/*
		 * c=a[0]+a[1]; System.out.println("Sum is: "+c);
		 * System.out.println("Length is: "+a.length);
		 */

		// add
		int c = 0;
		
		for (int i = 0; i < a.length; i++) {
			c = c + a[i];
		}

		System.out.println("Sum is: " + c);
		System.out.println("Length is: " + a.length);

	}
}

public class Var_ArgMethodClass {

	public static void main(String[] args) {

		Sum s = new Sum();

		s.sum(10, 20);
		s.sum(30, 40, 50);

	}

}
