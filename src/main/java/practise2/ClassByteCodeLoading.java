package practise2;

class ByteCode 
{
	static int a=10;
	
	static 
	{
		System.out.println("Value of a is: "+a);
	}
}
public class ClassByteCodeLoading {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class ob=Class.forName("practise2.ByteCode");
		System.out.println(ob.getName());
		
		Class.forName("practise2.ByteCode");  //Loads only once
		Class.forName("practise2.ByteCode");
		Class.forName("practise2.ByteCode");
		
	/*	Class c=ByteCode.class;
		System.out.println(c.getName());*/
		

	}

}
