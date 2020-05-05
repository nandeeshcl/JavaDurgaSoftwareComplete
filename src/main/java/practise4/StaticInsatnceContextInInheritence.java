package practise4;

class Parent {

	static int a = m1();

	static int m1() {
		System.out.println("m1() method");
		return 10;

	}

	void m2() {
		System.out.println("Insatnce method m1()");
	}

	Parent() {
		System.out.println("Parent constructor");
	}

	static {
		System.out.println("Parent Static block");
	}

	{
		System.out.println("Parent instance block");
	}

}

class Child extends Parent {

	static int b = m3();

	static int m3() {
		System.out.println("m3() method");
		return 20;

	}

	void m4() {
		System.out.println("Insatnce method m4()");
	}

	Child() {
		System.out.println("Child constructor");
	}

	static {
		System.out.println("Parent Static block");
	}

	{
		System.out.println("Child insatnce block");
	}

}

public class StaticInsatnceContextInInheritence {

	public static void main(String[] args) {

		Child c = new Child();

	}

}
