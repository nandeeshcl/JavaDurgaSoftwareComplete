package practise1;

import java.util.Date;

class VariableScope
{
	int a=20;
	int b;
	static int c=30;
	
	
	
	void m1()
	{
		int a=10;
		
		//static int b=20;  local variale cannot be static
		
		System.out.println("Value of a is:"+a);
		
		System.out.println("Value of b is:"+b);
		
		System.out.println("Value of c is:"+c);
		
		System.out.println("Value of class a is:"+this.a);
		
		Date d = null;
		System.out.println(d);
		
		
	}
}
public class DefaultValuesOfVariables {

	
	public static void main(String[] args) {
		
		VariableScope v=new VariableScope();
		v.m1();
		
		
		

	}

}
