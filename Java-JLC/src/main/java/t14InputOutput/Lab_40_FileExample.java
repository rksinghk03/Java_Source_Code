package t14InputOutput;

import java.io.File;

public class Lab_40_FileExample {

	public static void main(String[] args) {
		
		File f=new File("C:\\raj");
		 String filenames[]=f.list();  
		    for(String filename:filenames){ 
		System.out.println(filename);
		}
	}
}
