package polymorphism;


class A
{
	static void m1()
	{
		System.out.println("Hai");
	}
}

class B extends A
{
	static void m1()
	{
		System.out.println("Bai");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		A a=new B();
		
		a.m1();  //Bai  method has been over rided
		
		/*B b=new B();
		b.m1();
		
		A a1=new A();
		a1.m1();*/

	}

}
