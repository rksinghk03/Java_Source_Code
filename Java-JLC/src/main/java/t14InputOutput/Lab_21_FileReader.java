package t14InputOutput;

import java.io.FileReader;

public class Lab_21_FileReader {
	public static void main(String args[])throws Exception{    
        FileReader fr=new FileReader("C:\\raj\\testout.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
  }    
}
