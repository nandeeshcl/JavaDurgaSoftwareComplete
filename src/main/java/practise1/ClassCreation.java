package practise1;

class Student {
	int a = 10;

	void m1() {
		System.out.println("m1() method");
		
	
		
		int b=10;
		System.out.println("Value of b is: "+b);
	}

	void m2() {
		//m1();
	//	System.out.println("Value of b is: "+b);
	}

}

public class ClassCreation {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.m1();
		System.out.println("Value of as is: " + s1.a);

	}

}
