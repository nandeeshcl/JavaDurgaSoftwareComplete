package properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileWriting {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
		prop.setProperty("environment","staging");
		
		FileOutputStream fos =new FileOutputStream("./src\\\\test\\\\java\\\\properties\\\\config2.properties");
		prop.store(fos,"something wrong while writing");
		
		System.out.println("content written in properties file");

	}

}
