package rough;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyFIleReader {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("./src\\test\\java\\rough\\config.properties");

		Properties prop = new Properties();

		prop.load(fis);

		System.out.println("User name is: " + prop.getProperty("username"));
		System.out.println("Password is: " + prop.getProperty("password"));
		System.out.println("URL is: " + prop.getProperty("url"));

		FileOutputStream fos = new FileOutputStream("./src\\\\test\\\\java\\\\rough\\\\config1.properties");
		
		/*Properties propw=new Properties();
		
		propw.setProperty("environment1","QA");
		propw.setProperty("environment2","Prod");*/
		
		
		prop.store(fos,"value set"); // load all content of prop obj to file
		
		//fis.close();
	//	fos.close();
		

	}

}
