package com.practise.basics;

abstract class A {
	public void m1() {
		System.out.println("method m1");
	}

	 abstract public void m2();

}

class B extends A {

	public  void m2() {

		System.out.println("method m2");

	}

}

public class AbstractClass1 {

	public static void main(String[] args) {

		B b = new B();

		b.m1();
		b.m2();

	}

}
