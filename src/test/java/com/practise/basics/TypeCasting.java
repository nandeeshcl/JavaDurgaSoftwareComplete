package com.practise.basics;

public class TypeCasting {

	public static void main(String[] args) {
		//ImplicitTypeCasting.test1();
		
		ExplicitTypeCasting.test2();
	}

}

// IMPLICIT TYPE CASTING

class ImplicitTypeCasting {
	public static void test1() {

		/*
		 * byte b = 10; int i = b; System.out.println(b + "   " + i);
		 */ // OUT PUT 10 10

		/*
		 * byte b = 10; char c = b; //ERROR Cannot convert byte to char
		 * System.out.println(b + "   " + c);
		 */

		/*
		 * char c='A'; int i=c; //ASCII value of A will be assigned to i
		 * System.out.println(i+"     "+c); //OUTPUT 65 A
		 */

		/*
		 * long l=444; float f=l; System.out.println(l+"     "+f); //OUTPUT: 444 444.0
		 */
		/*
		 * float f=44.44f; long l=f; //ERROR cannot convert float to long
		 * System.out.println(l+"     "+f);
		 */

		/*
		 * byte b=130; //ERROR cannot assign int to byte System.out.println(b);
		 */

	}
	
}

//EXPLICIT TYPE CASTING

class ExplicitTypeCasting {
	public static void test2() {

		int i=10;
		byte b=(byte) i;
		System.out.println(i+"  "+b);
		
		float f=33.33f;
		long l=(long) f;
		System.out.println(f+"  "+l);

	}
	
	
	
}
