package com.practise.basics;

public class VariableScope {

	public static void main(String[] args) {

		Test test = new Test();
		test.variableScope();

	}

}

class Test {

	int a = 10;
	// int a=20; ERROR same scope no duplicate

	void variableScope() {

	
		int a = 22;
		// int a=33; ERROR same scope no duplicate

		double d = 12_34_45.55;

		System.out.println("Value of d is: " + d);

		System.out.println("Values of a in Method level is: " + a); // local variable data is printed

		System.out.println("Values of a in Class level is: " + this.a); // Since this is used, class variable data is
																		// printed

	}
}
