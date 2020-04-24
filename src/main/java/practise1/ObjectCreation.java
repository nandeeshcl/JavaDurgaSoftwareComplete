package practise1;

class Engineer {
	int a = 22;
	int b = 33;

	Engineer(int c) {
		a = c;
		System.out.println(a);
	}

	Engineer() {
		System.out.println(b);
	}

}

public class ObjectCreation {

	public static void main(String[] args) {

		Engineer e = new Engineer(12);

		Engineer e1 = new Engineer();

	}

}
