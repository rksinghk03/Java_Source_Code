package t14InputOutput;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class Lab_07_DataStream {
	public static void main(String args[])throws Exception{    
	      FileOutputStream fout1=new FileOutputStream("C:\\Users\\RajSingh\\Documents\\FEB-2020\\f1.txt");    
	      FileOutputStream fout2=new FileOutputStream("C:\\Users\\RajSingh\\Documents\\FEB-2020\\f2.txt");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(65);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect    
	      System.out.println("Success...");    
	     }    

}
