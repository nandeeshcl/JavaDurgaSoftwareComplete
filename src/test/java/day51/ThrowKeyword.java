package day51;

import java.io.IOException;
import java.util.Scanner;

public class ThrowKeyword {

	public static void main(String[] args) throws IOException {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value");
		int a=sc.nextInt();
		
		if(a<=0)
		{
			throw new IOException("En macchi ninu 0 enter madidya...");
			//System.out.println("nope");  unreachable statement
		}
		
		System.out.println("nope");
		
	}

}
