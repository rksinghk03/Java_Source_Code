package t14InputOutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lab_09_DataOutput {
	public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("C:\\Users\\RajSingh\\Documents\\FEB-2020\\testout.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  


}
