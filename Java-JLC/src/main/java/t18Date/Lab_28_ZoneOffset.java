package t18Date;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;

public class Lab_28_ZoneOffset {
	  public static void main(String[] args) {  
		    ZoneOffset zone = ZoneOffset.UTC;  
		    Temporal temp = zone.adjustInto(ZonedDateTime.now());  
		    System.out.println(temp);  
		    
		    ZoneOffset offh = ZoneOffset.ofHours(5);  
		    System.out.println("ZoneOffset ofHours method = "+ offh);
		    
		    ZoneOffset offhm = ZoneOffset.ofHoursMinutes(5,30);  
		    System.out.println("ofHoursMinutes = " +offhm);
		  }

}
