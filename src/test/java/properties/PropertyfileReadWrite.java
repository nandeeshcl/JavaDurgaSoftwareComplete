package properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyfileReadWrite {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("./src\\test\\java\\properties\\config.properties");
		Properties prop = new Properties();
		prop.load(fis); // prop contains all file data

		// get and print data
		System.out.println("User name is: " + prop.getProperty("username"));
		System.out.println("Password is: " + prop.getProperty("password"));
		System.out.println("URL is: " + prop.getProperty("url"));

		// crate out file stream
		FileOutputStream fos = new FileOutputStream("./src\\test\\java\\properties\\config2.properties");

		// store all the content of obj prop to file
		prop.store(fos, "value set"); // load all content of prop obj to file

		fis.close();
		fos.close();
		
		System.out.println("read write done...");

	}

}
