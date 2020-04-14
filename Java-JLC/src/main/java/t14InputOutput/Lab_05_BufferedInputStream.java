package t14InputOutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Lab_05_BufferedInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  try{    
			    FileInputStream fin=new FileInputStream("C:\\Users\\RajSingh\\Documents\\FEB-2020\\testOut1.txt");    
			    BufferedInputStream bin=new BufferedInputStream(fin);    
			    int i;    
			    while((i=bin.read())!=-1){    
			     System.out.print((char)i);    
			    }    
			    bin.close();    
			    fin.close();    
			  }catch(Exception e){System.out.println(e);}    
		}    
}
