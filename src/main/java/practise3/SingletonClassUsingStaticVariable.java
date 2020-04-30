package practise3;

class Singleton3 {
	public static Singleton3 s = new Singleton3();

	private Singleton3() {

	}

	public static Singleton3 getRef() {
		return s;
	}

	void m1() {
		System.out.println("m1() method");
	}
}

public class SingletonClassUsingStaticVariable {

	public static void main(String[] args) {

		System.out.println(Singleton3.getRef());
		System.out.println(Singleton3.getRef());

	}

}
