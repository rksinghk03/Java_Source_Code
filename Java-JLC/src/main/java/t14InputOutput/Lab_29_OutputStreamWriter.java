package t14InputOutput;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Lab_29_OutputStreamWriter {
	public static void main(String[] args) {  
		  
        try {  
            OutputStream outputStream = new FileOutputStream("C:\\raj\\output.txt");  
            Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
  
            outputStreamWriter.write("Hello World");  
  
            outputStreamWriter.close();  
        } catch (Exception e) {  
            e.getMessage();  
        } 
        System.out.println("ts done ************");
    }  

}
