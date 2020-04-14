package t14InputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Lab_22_BufferedWriter {

	public static void main(String[] args) throws Exception {     
	    FileWriter writer = new FileWriter("C:\\raj\\testoutb.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to javaTpoint.");  
	    buffer.close();  
	    System.out.println("Success'''");  
	    }  
}
