package p2;

import p1.A;

public class D extends A {

	public static void main(String[] args) {

		// System.out.println("Value of pri is: " + A.pri); ERROR cannot access private
		// members
		System.out.println("Value of pub is: " + pub);
		// System.out.println("Value of def is: " + def); ERROR cannot access default
		// member outside the package
		System.out.println("Value of pro is: " + pro);

	}

}
