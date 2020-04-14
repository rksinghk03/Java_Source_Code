package t18CalanderClass;

import java.util.Calendar;

public class Lab_05_Calendaradd {
	   public static void main(String[] args){  
	       // create a new calendar  
	     Calendar cal = (Calendar) Calendar.getInstance();  
	        // print the current date and time  
	      System.out.println("" + cal.getTime());  
	        int weekday = cal.get(Calendar.DAY_OF_WEEK);  
	        cal.add(Calendar.HOUR, 10);  
	        // print the modified date and time  
	      System.out.println("" + cal.getTime());       
	      cal.add(Calendar.MINUTE, 10);       
	     System.out.println("" + cal.getTime());  
	       cal.add(Calendar.SECOND, 10);        
	      System.out.println("" + cal.getTime());         
	    } 

}
