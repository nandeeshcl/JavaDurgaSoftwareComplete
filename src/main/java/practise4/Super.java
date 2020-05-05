package practise4;

class ParentSuper {
	int a = 10;

	ParentSuper(int c) {
		System.out.println("Value of c is: " + c);
	}

	void m1() {
		System.out.println("Parent m1");
	}
}

class ChildSuper extends ParentSuper {

	int a = 22;

	ChildSuper() {
		super(10);
		System.out.println("Child class const");
	}

	void m1() {
		int a = 33;
		System.out.println("value of a parent is:" + super.a);
		System.out.println("value of a child is:  " + this.a);
		System.out.println("value of a local is: " + a);
	}

}

public class Super {

	public static void main(String[] args) {

		ChildSuper s = new ChildSuper();
		s.m1();

	}

}
9