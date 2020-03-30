package t09String;

import java.util.StringTokenizer;

public class Lab_01_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer  n = new StringTokenizer("Hi raj how are you");
		n.hasMoreTokens();
		
		while (n.hasMoreTokens()) {
		System.out.println(n.nextElement());
		}
	}

}
