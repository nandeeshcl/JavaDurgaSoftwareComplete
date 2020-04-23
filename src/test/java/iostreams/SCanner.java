package iostreams;

import java.util.Scanner;

public class SCanner {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter emp number...");
		int eno=s.nextInt();
		
		System.out.println("Enter emp name...");
		String ename=s.nextLine();
		
		//System.out.println("Employee details are...");
		
		System.out.println("Emp name is: "+ename);
		System.out.println("Emp id is: "+eno);

	}

}
