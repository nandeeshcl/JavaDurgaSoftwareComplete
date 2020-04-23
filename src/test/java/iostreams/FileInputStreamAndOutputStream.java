package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamAndOutputStream {

	public static void main(String[] args) throws Exception {

		// to write the data
		FileOutputStream fos = new FileOutputStream("./src\\test\\java\\iostreams\\abc.txt", true);
		String data = "Welcome...";
		byte b[] = data.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("Data written successfully into the file");

		// to read the data from file
		FileInputStream fis = new FileInputStream("./src\\test\\java\\iostreams\\abc.txt");
		int size = fis.available();
		byte c[] = new byte[size];
		fis.read(c);
		String s = new String(c);
		System.out.println("FIle data is: " + s);
		fis.close();

	}

}
