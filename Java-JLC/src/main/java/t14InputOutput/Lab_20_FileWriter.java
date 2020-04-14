package t14InputOutput;

import java.io.FileWriter;

public class Lab_20_FileWriter {
	 public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("C:\\raj\\testout2.txt");    
           fw.write("Welcome to javaTpoint.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}
