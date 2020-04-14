package t14InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Lab_30_InputStreamReader {
	public static void main(String[] args) throws IOException {
		try {
			InputStream stream =new FileInputStream("C://raj/output.txt");
			  Reader reader = new InputStreamReader(stream);  
	            int data = reader.read();  
	            while (data != -1) {  
	                System.out.print((char) data);  
	                data = reader.read();  
	            }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
