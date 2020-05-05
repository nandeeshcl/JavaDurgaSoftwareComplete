package practise5;

interface I {
	int a = 10;

	void m1();

}

class C implements I {

	@Override
	public void m1() {
		System.out.println("m1()");

	}

}

public class Interface {

	public static void main(String[] args) {

		C c = new C();
		I i = new C();

		System.out.println(I.a);
		System.out.println(C.a);
		System.out.println(c.a);
		System.out.println(i.a);

		c.m1();
		i.m1();

	}

}
