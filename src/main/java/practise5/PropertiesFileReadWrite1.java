package practise5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadWrite1 {

	public static void main(String[] args) throws IOException {
		
		//read from prop file
		/*FileInputStream fis=new FileInputStream("./\\src\\main\\PropertiesFile\\config.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		System.out.println("URL is: "+prop.getProperty("url"));
		System.out.println("Password is: "+prop.getProperty("un"));
		System.out.println("Password is: "+prop.getProperty("pw"));
		
		fis.close();*/
		
		//Write
		Properties prop=new Properties();
		
		prop.setProperty("staging_instance_url","www.google.com");
		
		FileOutputStream fos=new FileOutputStream("./\\\\src\\\\main\\\\PropertiesFile\\\\config.properties");
        
		prop.store(fos, "Data loaded");
		
		fos.close();
		
	}

}
