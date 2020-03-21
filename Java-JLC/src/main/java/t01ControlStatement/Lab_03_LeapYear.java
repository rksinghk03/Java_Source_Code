package t01ControlStatement;
import java.util.*;
public class Lab_03_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int year=2024;    
		    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0))System.out.println("Leap year= "+year);
		    
		    else 
		    	System.out.println("Its not leap year"+year);
		    

	}

}
