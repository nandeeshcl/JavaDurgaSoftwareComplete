package practise2;

class StaticV {
	static int a = 10;
	int b = 22;

	static {
		int c = 33;
		System.out.println(c);
		System.out.println(a);
	}

	static int d = m1();

	static int m1() {
		System.out.println("m1()");
		return 44;
	}

}

public class StaticVariable {

	public static void main(String[] args) {

		StaticV s = new StaticV();

		System.out.println(StaticV.a);
		System.out.println(s.a);

	}

}
