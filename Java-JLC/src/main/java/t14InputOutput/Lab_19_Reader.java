package t14InputOutput;

import java.io.FileReader;
import java.io.Reader;

public class Lab_19_Reader {
	public static void main(String[] args) {  
        try {  
            Reader reader = new FileReader("file.txt");  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
            reader.close();  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  
    }  

}
