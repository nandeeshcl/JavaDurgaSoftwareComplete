package com.practise.basics;

class Static {
	static String schoolName = "marimallapa";

	String name = "";
}

public class StaticVariable2 {

	public static void main(String[] args) {

		Static s1 = new Static();
		s1.name = "Appu";

		System.out.println("School name is: " + s1.schoolName);
		System.out.println("Nam is: " + s1.name);

		Static s2 = new Static();

		s2.schoolName = "Geetha"; // if we do any modification it reflects to all objects
		System.out.println("School name is: " + s2.schoolName);
		System.out.println("School name is: " + s1.schoolName);

		s2.name = "Bappu";
		System.out.println("Nam is: " + s1.name);
		System.out.println("Nam is: " + s2.name);

		// System.out.println("Nam is: "+s1.name);

	}

}
