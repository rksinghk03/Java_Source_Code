package t14InputOutput;

import java.io.FileInputStream;

public class Lab_03_FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream  fis=new FileInputStream ("C:\\Users\\RajSingh\\Documents\\FEB-2020\\testOut.txt");
			int h = 0;
			while((h=fis.read())!=-1) {
			System.out.println((char)h);}
			fis.close();
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
