package t14InputOutput;

import java.io.File;

public class Lab_38_FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File file=new File("C:\\raj\\file1.txt");
		if(file.createNewFile()) {
			System.out.println("File is created ");
		}else {
			System.out.println("File is all ready present ");
		}
		
		}
		catch (Exception e){
			System.out.println(e);
			
		}
	}

}
