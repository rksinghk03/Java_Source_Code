package t14InputOutput;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class Lab_12_FilterInputStream {
	 public static void main(String[] args) throws IOException {  
	        File data = new File("C:\\raj\\testout.txt");  
	        FileInputStream  file = new FileInputStream(data);  
	        FilterInputStream filter = new BufferedInputStream(file);  
	        int k =0;  
	        while((k=filter.read())!=-1){  
	            System.out.print((char)k);  
	        }  
	 }

}
