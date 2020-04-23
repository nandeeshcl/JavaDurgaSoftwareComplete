package arrays;

class A
{
	public void display(String s[])
	{
		for(String i:s)
		{
			System.out.println(i);
		}
	}
}
public class AnonymousArray {

	public static void main(String[] args) {
		
		A a=new A();
		
		//anonymous array
		a.display(new String[] {"a","b","c"});

	}

}
