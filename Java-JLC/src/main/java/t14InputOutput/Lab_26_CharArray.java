package t14InputOutput;

import java.io.CharArrayReader;
import java.io.IOException;

public class Lab_26_CharArray {
	public static void main(String[] args) throws IOException {
		System.out.println("CharArrayExample");
		char arr[]= {'r','a','j','k','u','m','a','r'};
		CharArrayReader cha=new CharArrayReader(arr);
		System.out.println(arr);
		int k=0;
		while((k=cha.read())!=-1) {
			char ch =(char)k;
			System.out.print(ch+":");
			System.out.println(k);
			
		}
	}

}
