package t18Date;

import java.time.Period;
import java.time.ZonedDateTime;

public class Lab_24_minus {
	  public static void main(String[] args) {  
		    ZonedDateTime zone= ZonedDateTime.now();  
		    ZonedDateTime m = zone.minus(Period.ofDays(101));  
		    System.out.println(m);
	  }

}
