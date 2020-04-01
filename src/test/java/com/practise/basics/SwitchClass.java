package com.practise.basics;

public class SwitchClass {

	public static void main(String[] args) {

		String str = "Sun";

		switch (str) {
		case "Mon":
			System.out.println("Monday");
			break;
		case "Tue":
			System.out.println("Tuesday");
			break;

		case "Wed":
			System.out.println("Wednesday");
			break;

		case "Thu":
			System.out.println("Thursday");
			break;

		default:
			System.out.println("May be Fri/Sat/Sun");
		}

	}

}
