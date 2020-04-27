package practise2;

class This {
	int b = 10;

	This(int a) {
		System.out.println("Values of a is: " + a);
	}

	This() {
		this(10);
		System.out.println("Default constructor");
	}

	void m1() {
		System.out.println("m1() method..");
	}

	void m2() {
		this.m1();
		m1();
		int b = 33;
		System.out.println("Value of b is: " + b);
		System.out.println("Value of class b is: " + this.b);
	}

	This getRef() {
		return this;
	}

}

public class ThisKeyword {

	public static void main(String[] args) {

		This s = new This();

		This s1 = s.getRef();
		This s2 = s.getRef();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(s1.toString());
		System.out.println(s2.toString());

		s1.m2();
		
	
		
		

	}

}
