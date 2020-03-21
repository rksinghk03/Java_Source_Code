package t01ControlStatement;

import java.util.Scanner;

public class Lab_10_SwitchMonthExample {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter in betwwen 1 to 12 only");
int month =sc.nextInt();
String mon="";
switch (month) {
case 1:System.out.println("Month = January ");
break ;
case 2: System.out.println("Month = Feb");
break;
case 3:System.out.println("Month = March ");
break ;
case 4: mon= "4-April";
break;
default : System.out.println("Number is invalid ");
	}
//Printing month of the given number  
System.out.println(mon);  
	}
}
