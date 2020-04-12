package reflections;

import java.lang.reflect.Method;

class B {
	public void m1() {
		System.out.println("m1");
	}

	static void m2() {
		System.out.println("m2");
	}

	static {
		System.out.println("statsic block");
	}
}

public class ReflectionClassDetails {

	public static void main(String[] args) throws ClassNotFoundException {

		// get details of class B
		Class c = Class.forName("reflections.B");
		System.out.println("Class name is: " + c.getName());

		// to get method details
		Method m[] = c.getMethods();

		System.out.println("Total methods are: " + m.length);

	
		for (Method i : m) {
			System.out.println(i.getName());
		}
		// System.out.println(m[0].getName());

	}

}
