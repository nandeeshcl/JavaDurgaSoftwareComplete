package com.practise.basics;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Class2 {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.setData("appu@gmail.com", "a123");

		e2.setData("sivu@gmail.com", "s123");

		e1.getData();
		e2.getData();
		
		Abs a=null;

	}

}

abstract class Abs
{
	
}
class Employee {
	String email;
	String password;

	public void setData(String e, String p) {
		email = e;
		password = p;
	}

	public void getData() {
		System.out.println("Employee credentials are:");
		System.out.println("Email is: " + email);
		System.out.println("Password is: " + password);
	}

}
