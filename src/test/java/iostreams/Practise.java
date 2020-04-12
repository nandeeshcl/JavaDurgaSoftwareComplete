package iostreams;

import java.io.FileInputStream;
import java.util.StringTokenizer;


public class Practise {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("./src\\test\\java\\iostreams\\abc.txt");
		int size = fis.available();
		byte c[] = new byte[size];
		fis.read(c);
		String s = new String(c);
		
		StringTokenizer st=new StringTokenizer(s);
		
		System.out.println("Total number of tokens are: "+st.countTokens());
		
		int count=0;
		
		while(st.hasMoreTokens())
		{   
			if(st.nextToken().equals("Welcome"))
			{
				count++;
			}
			//System.out.println(st.nextToken());
		}
		
		System.out.println("Total numbe rof welocme are: "+count);
		
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		
		
		//System.out.println("FIle data is: " + s);
		fis.close();


	}

}
