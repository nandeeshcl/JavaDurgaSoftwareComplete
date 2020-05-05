package practise5;

abstract class Abstract {
	abstract public void m1();

	public void m2() {
		System.out.println("m2");
	}
	Abstract()
	{
		System.out.println("Abstract con");
	}
}

class Main extends Abstract {
	public void m1() {
		System.out.println("m1");
	}

	public void m3() {
		System.out.println("m3");
	}
}

public class AbstractClass {

	public static void main(String[] args) {

		Abstract a = new Main();
		Main m = new Main();
		m.m2();
	}

}
