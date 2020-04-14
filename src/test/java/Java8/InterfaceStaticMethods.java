package Java8;

interface I
{
	static void m()
	{
		System.out.println("m1 methods");
	}
	
	void m2();
}

class B implements I
{
	static void m()
	{
		System.out.println("Overrided");
	}
	
	public void m2()
	{
		System.out.println("m2 method");
	}
}
public class InterfaceStaticMethods {

	public static void main(String[] args) {
		
		B b=new B();
		b.m();
		B.m();
		
		I i=new B();
		
		I.m();
		
		b.m2();
		i.m2();

	}

}
