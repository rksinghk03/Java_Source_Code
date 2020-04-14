package t14InputOutput;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class Lab_06_SequenceInputStream {
	public static void main(String args[])throws Exception{    
		   FileInputStream input1=new FileInputStream("C:\\Users\\RajSingh\\Documents\\FEB-2020\\testOut1.txt");    
		   FileInputStream input2=new FileInputStream("C:\\Users\\RajSingh\\Documents\\FEB-2020\\testOut.txt");    
		   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		   int j;    
		   while((j=inst.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   inst.close();    
		   input1.close();    
		   input2.close();    
		  }    

}
