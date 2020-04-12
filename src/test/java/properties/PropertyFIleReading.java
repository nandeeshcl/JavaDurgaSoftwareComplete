package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFIleReading {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./src\\test\\java\\properties\\config.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		System.out.println("URL is: "+prop.getProperty("url"));
		System.out.println("UserName is: "+prop.getProperty("username"));
		System.out.println("Pasword is: "+prop.getProperty("password"));
		
		

	}

}
