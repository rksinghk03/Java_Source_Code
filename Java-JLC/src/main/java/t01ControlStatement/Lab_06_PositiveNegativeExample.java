package t01ControlStatement;

import java.util.Scanner;

public class Lab_06_PositiveNegativeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any number \n");
		int n=sc.nextInt();
		if(n<0)System.out.println("Numebr is Negative");
		else if(n>0)System.out.println("Number is Passative");
		else System.out.println("Number is Zero");
		

	}

}
