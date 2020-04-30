package practise4;

class A {

}

public class EqualMethodVSEqualOperator {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println(a == b);

		A c = new A();
		A d = new A();

		System.out.println(c == d);

		System.out.println(c.equals(d));

		String s1 = new String("appu");
		String s2 = new String("appu");

		System.out.println(s1 == s2);

		System.out.println(s1.equals(s2));

	}

}
