package practise2;

class Instance {

	{
		System.out.println("I am instance block 1");
	}

	int b = m1();

	{
		System.out.println("I am instance block 2");
	}

	int m1() {
		System.out.println("m1 method executed...");
		return 10;
	}

	void m2() {
		System.out.println("m2() method...");
	}

	Instance() {
		System.out.println("Instance constructor");
	}

}

public class InstanceContext {

	public static void main(String[] args) {

		Instance i1 = new Instance();

		i1.m2();

		Instance i2 = new Instance();

	}

}
