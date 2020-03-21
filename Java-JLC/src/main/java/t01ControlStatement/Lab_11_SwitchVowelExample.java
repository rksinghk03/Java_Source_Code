package t01ControlStatement;

import java.util.Scanner;

public class Lab_11_SwitchVowelExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please eneter Vowels ");
		char ch =sc.next().charAt(0);
		String ch1 = sc.findInLine("a");
		switch(ch) {
		case 'a':System.out.println("Vowel");
		break;
		case 'e':System.out.println("Vowel");
		break;
		case 'i':System.out.println("Vowel");
		break;
		case 'o':System.out.println("Vowel");
		break;
		case 'u':System.out.println("Vowel");
		break;
		case 'A':System.out.println("Vowel");
		break;
		case 'E':System.out.println("Vowel");
		break;
		case 'I':System.out.println("Vowel");
		break;
		case 'O':System.out.println("Vowel");
		break;
		case 'U':System.out.println("Vowel");
		break;
		default:
			System.out.println("Please enter Vowels only");

		}
		

	}

}
