package practise3;

class Singleton2
{
	public static Singleton2 s=null;
	
	private Singleton2()
	{
		
	}
	
	
	static 
	{
	     s=new Singleton2();	
	}
	
	public static Singleton2 getRef()
	{
		return s;
	}
	
	void m1()
	{
		System.out.println("m1() method");
	}
}
public class SingletonClassUsingStaticBlock {

	public static void main(String[] args) {
		
		Singleton2 s1=Singleton2.getRef();
		Singleton2 s2=Singleton2.getRef();
		Singleton2 s3=Singleton2.getRef();
		
		s1.m1();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
