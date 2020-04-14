package t14InputOutput;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Lab_28_PrintStream {
	public static void main(String arg[])  throws Exception {
		 FileOutputStream fout=new FileOutputStream("C:\\raj\\28.txt ");    
		   PrintStream pout=new PrintStream(fout);    
		   pout.println(2020);    
		   pout.println("Hello Java");    
		   pout.println("Welcome to Java");    
		   pout.close();    
		   fout.close();    
		  System.out.println("Success?");    
		 }    
}
