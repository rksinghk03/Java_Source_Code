package t14InputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Lab_01_FileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\RajSingh\\Documents\\FEB-2020\\test.txt");
			fos.write(65);
			System.out.println("Sucess ....");
			fos.close();
		} catch (Exception e) {
			
		 System.out.println(e);
		}
		

	}

}
