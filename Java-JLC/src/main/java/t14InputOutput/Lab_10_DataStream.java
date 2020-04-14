package t14InputOutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Lab_10_DataStream {
	 public static void main(String[] args) throws IOException {  
		    InputStream input = new FileInputStream("C:\\raj\\testout.txt");  
		    DataInputStream inst = new DataInputStream(input);  
		    int count = input.available();  
		    byte[] ary = new byte[count];  
		    inst.read(ary);  
		    for (byte bt : ary) {  
		      char k = (char) bt;  
		      System.out.print(k+"-");  
		    }  
	 }

}
