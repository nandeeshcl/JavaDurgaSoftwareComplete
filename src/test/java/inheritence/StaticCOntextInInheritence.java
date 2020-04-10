package inheritence;

class A
{
	static
	{
		System.out.println("A static block");
	}
	
	static int a=m1();
	
	public static int m1()
	{
		System.out.println("A m1()");
		return 10;
	}

	{
		System.out.println("A instance block");
	}
	
	A()
	{
		System.out.println("A constructor");
	}

	public static void m4()
	{
		System.out.println("A methos");
		
	}
}

class B extends A
{

	static int b=m2();
	
	static
	{
		System.out.println("B static block");
	}
	
	
	
	public static int m2()
	{
		System.out.println("B m2()");
		return 10;
	}
	
	{
		System.out.println("B instance block");
	}
	
	B()
	{
		System.out.println("B constructor");
	}
	
	
	public static void m5()
	{
		System.out.println("B methos");
		
	}
	
	void m()
	{
		System.out.println("m");
	}
	
}
public class StaticCOntextInInheritence {
	
	public static void main(String[] args) {
		
		 
		 A.m4();
		// B.m5();
		 
		// B b=new B();
		//A a=new A();
		 
		// a.m();
		 
		 
	
		 
	}

}
