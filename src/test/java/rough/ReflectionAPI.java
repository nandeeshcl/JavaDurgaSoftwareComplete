package rough;

import java.lang.reflect.Method;



class Employee
{
	public void m1()
	{
		
	}
	
	void m2()
	{
		
	}
	
	int a=10;
	
}
public class ReflectionAPI {

	public static void main(String[] args) throws ClassNotFoundException {
	
	//	Class c=Class.forName("rough.Employee");
		
		Class<Employee> c=Employee.class;
		
		
		System.out.println(c.getName());
		
		Method m[]=c.getDeclaredMethods();
		
		for(Method i:m)
		{
			System.out.println(i);
			System.out.println(i.getModifiers());
			System.out.println(i.getName());
		}
	}

}
