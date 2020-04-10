package inheritence;


interface I
{
	int a=10;
	
	static void m1();
	
}

class C implements I
{
	public static  void m1()
	{
		System.out.println("m1 method");
	}
}
public class Interface {

	public static void main(String[] args) {
		
		C c=new C();
		
		System.out.println(c.a);
		System.out.println(C.a);
		System.out.println(I.a);
		System.out.println();
		
		c.m1();
		
		I i=new C();
		
		i.m1();
		
		
		
		

	}

}
