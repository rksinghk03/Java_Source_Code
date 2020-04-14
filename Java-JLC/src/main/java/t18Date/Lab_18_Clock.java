package t18Date;

import java.time.Clock;

public class Lab_18_Clock {

	 public static void main(String[] args) {  
		    Clock c = Clock.systemUTC();  
		    System.out.println(c.instant());  
		  } 
}
