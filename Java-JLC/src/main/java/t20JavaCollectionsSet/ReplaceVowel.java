package t20JavaCollectionsSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReplaceVowel {

	 static Scanner sc = new Scanner(System.in);

	  public static void main(String[] args) {
	    System.out.print("Enter a string: ");
	    String s = sc.nextLine();
	    String originalString = s;

	    for (int i = 0; i < s.length(); i++) {
	      char c = s.charAt(i);
	      if ((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i')
	          || (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u')) {
	        String front = s.substring(0, i);
	        String back = s.substring(i + 1);
	        s = front + "*" + back;
	      }
	    }
	    System.out.println(originalString);
	    System.out.println(s);
	  }
}
