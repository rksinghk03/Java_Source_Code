package t14InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;

public class Lab_23_BufferedReader {
	public static void main(String args[])throws Exception{    
        FileReader fr=new FileReader("C:\\raj\\testoutb.txt");    
        BufferedReader br=new BufferedReader(fr);    

        int i;    
        while((i=br.read())!=-1){  
        System.out.print((char)i);  
        }  
        br.close();    
        fr.close();    
  }    

}
