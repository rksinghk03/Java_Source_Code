package t11ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {

	public static void main(String[] args) {
		
		PrintWriter pw;
		try {
			pw=new PrintWriter("Test.txt");
			pw.println("saved");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("File Not Found");
		

	}

}
