package day51;

import java.io.IOException;
import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) throws IOException {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value");
		int a=sc.nextInt();
		
		if(a<=0)
		{
			try
			{
				throw new ArithmeticException("En macchi ninu 0 enter madidya...");
				
			}
			
			catch(ArithmeticException e)
			{
				e.printStackTrace();
				System.out.println("SWR");
			}
			//System.out.println("nope");  unreachable statement
		}
		
		System.out.println("nope");

	}

}
