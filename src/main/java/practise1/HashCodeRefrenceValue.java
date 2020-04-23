package practise1;

class Test1 {

}

public class HashCodeRefrenceValue {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		Test1 t2 = new Test1();

		System.out.println(t1.toString());
		System.out.println(t2.toString());

		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

		Class c = Test1.class;
		System.out.println(c.getPackage());

	}

}
