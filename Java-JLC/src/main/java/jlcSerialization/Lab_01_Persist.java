package jlcSerialization;
import java.io.*;

public class Lab_01_Persist {
	 public static void main(String args[]){  
		  try{  
		  //Creating the object  
		  Student s1 =new Student(211,"ravi");  
		  //Creating stream and writing the object  
		  FileOutputStream fout=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  out.writeObject(s1);  
		  out.flush();  
		  //closing the stream  
		  out.close();  
		  System.out.println("success");  
		  System.out.println("hhehe");
		  
		  }catch(Exception e){
			  System.out.println(e);
			  }  
		 }  

}
