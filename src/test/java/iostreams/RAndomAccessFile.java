package iostreams;

import java.io.RandomAccessFile;

public class RAndomAccessFile {

	public static void main(String[] args) throws Exception {
		
		RandomAccessFile raf
		             =new RandomAccessFile
		                      ("D:\\API_Testing_W2A\\API_Testing_Framework\\Java\\src\\test\\java\\iostreams\\status.csv","rw");
		
		String uname="success";
		String password="auccess123";
		
		raf.writeUTF(uname);  //write in first line
		raf.writeUTF(password);  //write in second line
		
		raf.seek(0);
		
		System.out.println("User name: "+raf.readUTF());
		System.out.println("Password is: "+raf.readUTF());
		
		
		
		
		

	}

}
