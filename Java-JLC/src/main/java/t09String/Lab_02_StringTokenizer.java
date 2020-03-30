package t09String;

import java.util.StringTokenizer;

public class Lab_02_StringTokenizer {
	public static void main(String args[]) {
	StringTokenizer  n=new StringTokenizer("Hi,raj,how,are,you");
	System.out.println("Next token is : " + n.nextToken(","));  
		/*
		 * while(n.nextToken(",") != null) { System.out.println(); }
		 */
	}

}
