package practise4;

class Father {

	public static void m1() {
		System.out.println("Hai...");
	}

}

class Child1 extends Father {

	public static void m1() {
		System.out.println("Bai....");
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Child1 c = new Child1();
		c.m1();

	}

}
