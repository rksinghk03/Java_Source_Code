package t18Date;

import java.time.ZonedDateTime;

public class Lab_21_ZonedDateTime {
	public static void main(String[] args) {  
	    ZonedDateTime zone = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");  
	    System.out.println(zone);  
	  }  

}
