package com.practise.basics;

class ObjectValue {
	int a = 10;
	float f;
	char c = 'X';

	ObjectValue() {
		c = 'A';
		a = 20;

	}

	void display() {
		System.out.println("Value of a is: " + a);
		System.out.println("Value of f is: " + f);
		System.out.println("Value of c is: " + c);
		// System.out.println("Value of l is: "+l);

	}

}

public class ObjectValueClass {

	public static void main(String[] args) {

		ObjectValue o = new ObjectValue();
		o.display();

	}

}
