package com.practise.basics;

class ThisKeyword
{
	int a=10;
	int b=20;
	
	ThisKeyword(int a,int b)
	{
		/*a=x;
		b=y;*/
		
		System.out.println("Local variables: "+a+" "+b);
		System.out.println("Class level var: "+this.a+" "+this.b);
	}
	/*void display()
	{
		System.out.println("Local variables: "+a+" "+b);
		System.out.println("Class level var: "+a+" "+b);
	}*/
}
public class This {

	public static void main(String[] args) {
		
		ThisKeyword t=new ThisKeyword(50,60);
		

	}

}
