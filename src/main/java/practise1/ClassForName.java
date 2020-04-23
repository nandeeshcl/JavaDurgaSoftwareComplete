package practise1;

class Employee {

}

public class ClassForName {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c = Class.forName("practise1.Employee");
		Class c1 = Employee.class;
		System.out.println(c.getSimpleName());
		System.out.println(c1.getSimpleName());
	}

}
