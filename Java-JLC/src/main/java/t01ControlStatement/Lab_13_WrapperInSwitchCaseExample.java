package t01ControlStatement;

import java.util.Scanner;

public class Lab_13_WrapperInSwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Please enter the age\n");

int age= sc.nextInt();
switch(age) {
case 16:System.out.println("you are under age");
break;
case 18:System.out.println("You are eligible  for vote");
break;
case 65:System.out.println("You are senior citizen");
break;
default : System.out.println("please enetr valid age");

}



	}

}
