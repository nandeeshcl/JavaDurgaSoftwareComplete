package practise3;

class StaticC {
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

}

public class StaticContext {

	public static void main(String[] args) throws ClassNotFoundException {

		StaticC s = new StaticC();

		Class.forName("practise3.StaticC");
	}

}
