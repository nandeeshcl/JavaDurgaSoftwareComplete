package inheritence;


class Parent
{
	int a=10;
	
	void m1()
	{
		System.out.println("Values of a is: "+a);
	}
	
	Parent()
	{
		System.out.println("Parent con");
	}
}

class Child extends Parent
{
	int a= 20;
	
	
//	Variable
/*	void m1(int a)
	{
		System.out.println("Value of child a is: "+a);  //local var
		System.out.println("Value of child a is: "+this.a);   //class level var
		System.out.println("Value of parent a is: "+super.a);  //super class  var
	}*/
	
	//Method
	void m1()
	{
		System.out.println("Value of child a is: "+a);  //local var
		System.out.println("Value of child a is: "+this.a);   //class level var
		System.out.println("Value of parent a is: "+super.a);  //super class  var
		
		super.m1();
	}
	
	
	
	Child()
	{
		System.out.println("Child con");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		
		Child c=new Child();
		
		c.m1();
		
	//	super.m1();
		
		

	}

}
