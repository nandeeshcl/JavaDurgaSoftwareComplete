package p1;

public class C {

	public static void main(String[] args) {

		//System.out.println("Value of pri is: " + A.pri); ERROR cannot access private members
		System.out.println("Value of pub is: " + A.pub);
		System.out.println("Value of def is: " + A.def);
		System.out.println("Value of pro is: " + A.pro);

	}

}
