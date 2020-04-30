package practise4;

import java.util.Scanner;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception,ArithmeticException {
		

		System.out.println("Enter the value: ");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		if(a==0)
		{
			throw new ArithmeticException("Zero value entered");
		}
		else
		{
			System.out.println("Entered value is: "+a);
		}
		
	}

}
