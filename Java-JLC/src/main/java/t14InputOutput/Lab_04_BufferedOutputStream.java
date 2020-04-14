package t14InputOutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Lab_04_BufferedOutputStream {
	public static void main(String args[])throws Exception{    
	     FileOutputStream fout=new FileOutputStream("C:\\\\Users\\\\RajSingh\\\\Documents\\\\FEB-2020\\\\testOut1.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="hi Amit how are ?whats going on.";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");    
	}    

}
