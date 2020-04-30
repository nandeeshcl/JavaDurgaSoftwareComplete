package practise4;

public class AutoboxingUnboxing {

	public static void main(String[] args) {

		// Autoboxing:implicit PDT to OT
		int i = 10;
		Integer in = i;
		System.out.println(i + " " + in);

		// Autounboxing: impicit OT to PDT
		Integer p = new Integer(10);
		int q = p;
		System.out.println(p + " " + q);

		// String to primitive type
		String str = "122";
		int a = Integer.parseInt(str);
		System.out.println(str + " " + a);

		// Primitive to string type
		int x = 10;
		String str1 = Integer.toString(x);
		System.out.println(str1 + " " + x);

	}

}
