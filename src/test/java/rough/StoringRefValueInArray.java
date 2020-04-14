package rough;


class A
{
	
}

class B
{
	
}
public class StoringRefValueInArray {

	public static void main(String[] args) {
	
		Object a[]=new Object[5];
		
		a[0]=new A();
		a[1]=new A();
		
		a[2]=new B();
		a[3]=new B();
		
		for(Object o:a)
		{
			System.out.println(o);
		}
			
		

	}

}
