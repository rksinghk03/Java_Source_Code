package t18Date;

import java.util.Calendar;
import java.util.TimeZone;

public class Lab_41_TimeZone_getOffset {
	   public static void main( String args[] ){      
		   TimeZone zone = TimeZone.getTimeZone("Asia/Kolkata");   
		   System.out.println("The Offset value of TimeZone: " +   
		   zone.getOffset(Calendar.ZONE_OFFSET));  
		   System.out.println("Java TimeZone class Example: getID method");
		   TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata");       
		   System.out.println("Value of ID is: " + timezone.getID());
		   
		   System.out.println("****Java TimeZone class Example: getDisplayName method");
		   TimeZone getzone = TimeZone.getDefault();  
		   String name = getzone.getDisplayName();         
		   System.out.println("Display name for default time zone: "+ name);  
		   } 

}
