package p2;

import p1.A;

public final class E {

	public static void main(String[] args) {

		// System.out.println("Value of pri is: " + A.pri); ERROR cannot access private
		// members
		System.out.println("Value of pub is: " + A.pub);
		// System.out.println("Value of def is: " + def); ERROR cannot access default
		// members outside the package
		// System.out.println("Value of pro is: " + pro); ERROR cannot access default
		// members outside the package if its not child of main class

	}

}
