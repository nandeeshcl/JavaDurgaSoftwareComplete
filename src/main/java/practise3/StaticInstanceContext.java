package practise3;

class StaticInstanceC {

	static int a = 10;
	static int b = m1();

	static int m1() {
		System.out.println("m1() method");
		return 10;
	}

	static {
		System.out.println("value of a is " + a);
		System.out.println("Static block");
	}

	static void m5() {
		System.out.println("Static method m5()");
	}

	// Insatnc econtext
	{
		System.out.println("I am instance block 1");
	}

	int p = m2();

	{
		System.out.println("I am instance block 2");
	}

	int m2() {
		System.out.println("m2 method executed...");
		return 10;
	}

	void m3() {
		System.out.println("m3() method...");
	}

	StaticInstanceC() {
		System.out.println("Instance constructor");
	}

}

public class StaticInstanceContext {

	public static void main(String[] args) {

		StaticInstanceC.m5();
		

		StaticInstanceC s = new StaticInstanceC();
		
		StaticInstanceC.m5();
		// s.m5();

	}

}
