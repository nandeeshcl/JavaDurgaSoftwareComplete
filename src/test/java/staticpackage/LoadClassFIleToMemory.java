package staticpackage;

class A
{
	static 
	{
		System.out.println("Static block");
	}
	
	void m1()
	{
		System.out.println("m1 method");
	}
}
public class LoadClassFIleToMemory {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c=Class.forName("staticpackage.A");
		
		
		System.out.println(c.getName());

	}

}
