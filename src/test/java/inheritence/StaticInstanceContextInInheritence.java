package inheritence;

class X
{
	X()
	{
		System.out.println("X con");
	}
	
	int m1() {
		System.out.println("m1()");
		return 10;
	}
	
	int i=m1();
}

class Y extends X
{
	int j=m2();
	
	Y()
	{
		System.out.println("Y con");
	}
	
	int m2()
	{
		System.out.println("m2()");
		return 10;
	}
}

class Z extends Y
{
	{
		System.out.println("IB-Z");
	}
	
	int m3()
	{
		System.out.println("m3()");
		return 10;
	}
	
	int k=m3();
	
	Z()
	{
		System.out.println("Z-con");
	}
}
public class StaticInstanceContextInInheritence {

	public static void main(String[] args) {
		
		Z z=new Z();
	}

}
