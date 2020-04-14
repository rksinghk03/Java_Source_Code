package t14InputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Lab_18_WriterExample {
	public static void main(String[] args) {  
        try {  
            Writer w = new FileWriter("output.txt");  
            String content = "I love my country";  
            w.write(content);  
            w.close();  
            System.out.println("Done");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
	}

}
