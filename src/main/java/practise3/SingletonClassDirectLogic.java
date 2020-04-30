package practise3;

class Singleton1 {
	public static Singleton1 s = null;

	private Singleton1() {
		System.out.println("Private constructor");
	}

	static Singleton1 getRef() {
		if (s == null) {
			s = new Singleton1();
			return s;
		}

		else {
			return s;
		}
	}
}

public class SingletonClassDirectLogic {

	public static void main(String[] args) {

		System.out.println(Singleton1.getRef());
		System.out.println(Singleton1.getRef());

	}

}
