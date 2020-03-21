package t01ControlStatement;
import java.util.*;

public class Lab_09_SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter number between 10 to 50 \n");
		int n = sc.nextInt();
		switch(n) {
		case 10: System.out.println("Number is = 10");
		break;
		case 20: System.out.println("Number is = 20");
		break;
		
		case 30: System.out.println("Number is = 30");
		break;
		
		case 40: System.out.println("Number is = 40");
		break;
		case 50: System.out.println("Number is = 50");
		default:System.out.println("Number should be in these 10, 20, 30 , 40, 50 ");
		
		
		}
		
	}
	

}
