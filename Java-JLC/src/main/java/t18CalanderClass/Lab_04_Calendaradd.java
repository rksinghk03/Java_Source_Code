package t18CalanderClass;

import java.util.Calendar;

public class Lab_04_Calendaradd {
	public static void main(String[] args){  
	       // create a new calendar  
	      Calendar cal = (Calendar) Calendar.getInstance();  
	        // print the current date and time  
	      System.out.println("" + cal.getTime());  
	        int weekday = cal.get(Calendar.DAY_OF_WEEK);  
	        cal.add(Calendar.DAY_OF_MONTH, 10);  
	        // print the modified date and time  
	      System.out.println("" + cal.getTime());          
	    } 

}
