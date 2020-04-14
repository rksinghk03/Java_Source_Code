package t14InputOutput;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Lab_27_CharArrayWriter {
	public static void main(String[] args) throws IOException {
		CharArrayWriter chw=new CharArrayWriter();
		chw.write("rajkumae singh");
		FileWriter f1=new FileWriter("C:\\raj\\a.txt");
		FileWriter f2=new FileWriter("C:\\raj\\b.txt"); 
		FileWriter f3=new FileWriter("C:\\raj\\c.txt");
		FileWriter f4=new FileWriter("C:\\raj\\d.txt"); 
		chw.writeTo(f1);
		chw.writeTo(f2);
		chw.writeTo(f3);
		chw.writeTo(f4);
		chw.close();
		f1.close();
		f2.close();
		f3.close();
		f4.close();
		System.out.println("hello");
	}

}
