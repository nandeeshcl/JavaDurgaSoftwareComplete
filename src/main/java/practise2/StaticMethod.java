package practise2;

class StaticM {
	int a = 10;
	static int b = 22;

	static void m1() {
		int p = 11;
		// static int q=12; //Local var cannot be static
		System.out.println("static method");
		// System.out.println(a); //instance member not allow ---to acess create ref var
		// and call
		StaticM s = new StaticM();
		System.out.println(s.a); // call instance using ref var

		System.out.println(b);
	}

}

public class StaticMethod {

	public static void main(String[] args) {

		StaticM.m1();

	}

}
