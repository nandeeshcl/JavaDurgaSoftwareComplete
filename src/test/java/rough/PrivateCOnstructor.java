package rough;

class Test {
	private Test() {
		System.out.println("Private const");
	}

	void m1() {
		System.out.println("m1 instance method");
	}

	static Test getRef() {
		return new Test();
	}

}

public class PrivateCOnstructor {

	public static void main(String[] args) {

		Test t1 = Test.getRef();

		t1.m1();

	}

}
