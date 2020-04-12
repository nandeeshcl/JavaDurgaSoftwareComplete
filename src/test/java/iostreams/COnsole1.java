package iostreams;

import java.io.Console;

public class COnsole1 {

	public static void main(String[] args) {

		System.out.println(System.console());

		Console c = System.console();

		String uname = c.readLine();
		System.out.println("User name is: " + uname);
		// char d[]=c.readPassword("Enter password");

		/*
		 * String password=new String(d);
		 * 
		 * 
		 * System.out.println("User name is: "+uname);
		 * System.out.println("Pasword is: "+password);
		 */
	}

}
