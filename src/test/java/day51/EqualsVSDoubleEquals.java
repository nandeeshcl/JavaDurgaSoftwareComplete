package day51;

public class EqualsVSDoubleEquals {

	public static void main(String[] args) {
		
		int a=10;
		int b=10;
		System.out.println(a==b);  //true
		
		A a1=new A();
		A a2=new A();
		
		System.out.println(a1==a2);  //false
		
	//System.out.println(a.equals(b)); 
		
		
		System.out.println(a1.equals(a2));  //false
		
		String s1=new String("appu");
		String s2=new String("appu");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}

}

class A
{
	
}
