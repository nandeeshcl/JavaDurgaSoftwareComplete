package iostreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterandFileReader {

	public static void main(String[] args) throws IOException {

		
		//writing to csv file
		/*FileWriter fw = new FileWriter("./src\\test\\java\\iostreams\\data.csv",false);
		String data = "Welcome to wipro";
		char ch[] = data.toCharArray();
		fw.write(ch);
		fw.close();
		System.out.println("file written");*/
		
		//reading from csv file
		/*FileReader fr = new FileReader("./src\\test\\java\\iostreams\\data.csv");
		String str="";
		int val=fr.read();
		while(val!=-1)
		{
			str=str+(char)val;
			val=fr.read();
		}
		System.out.println("Readed string is: "+str);*/
		
		
		FileReader fr = new FileReader("./src\\test\\java\\iostreams\\test.csv");
		String str="";
		int val=fr.read();
		while(val!=-1)
		{
			str=str+(char)val;
			val=fr.read();
		}
		System.out.println("Readed string is: "+str);
		
		
		
		

	}

}
