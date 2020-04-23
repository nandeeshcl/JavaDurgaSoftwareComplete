package day51;

class X
{
	void m1()
	{
		System.out.println("m1");
	}
}

class Y extends X
{
	void m2()
	{
		System.out.println("m2");
	}
}
public class ClassCastException {

	public static void main(String[] args) {
		
		    // Y y=new X();   class cast exception
		
		     X x=new Y();
             Y y=(Y) x;
		

             x.m1();
             y.m1();
             y.m2();
	}

}
