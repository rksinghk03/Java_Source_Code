package t14InputOutput;

import java.io.StringReader;

public class Lab_34_StringReader {
	public static void main(String[] args) throws Exception {  
        String srg = "Hello Java!! \nWelcome to Javatpoint.";  
        StringReader reader = new StringReader(srg);  
        int k=0;  
            while((k=reader.read())!=-1){  
                System.out.print((char)k);  
            }  
        }  

}
