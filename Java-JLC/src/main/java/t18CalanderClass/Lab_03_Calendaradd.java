package t18CalanderClass;

import java.util.Calendar;

public class Lab_03_Calendaradd {
	public static void main(String[] args) {  
	      // create a new calendar  
	      Calendar cal = (Calendar) Calendar.getInstance();  
	      // print the current date and time  
	      System.out.println("" + cal.getTime());  
	      // add 2 months   
	      cal.add((Calendar.MONTH), 2);  
	      // print the modified date and time  
	      System.out.println("" + cal.getTime());  
	       
	   } 

}
