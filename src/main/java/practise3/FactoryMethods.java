package practise3;

class Factory {

	// instance method
	void m1() {
		System.out.println("m1");
	}

	// instance factory method
	Factory getRefI() {
		return this;
	}

	// static factory method
	static Factory getRefS() {
		Factory f = new Factory();
		return f;
	}

}

public class FactoryMethods {

	public static void main(String[] args) {

		Factory f = Factory.getRefS();
		f.m1();

	}

}
