package t14InputOutput;

import java.io.FileOutputStream;

public class Lab_02_FileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\RajSingh\\Documents\\FEB-2020\\testOut.txt");
			String str="Hi Amit how are you?";
			byte[] b=str.getBytes();
			fos.write(b);
			System.out.println("write sucess in file testOut.txt");
			fos.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
