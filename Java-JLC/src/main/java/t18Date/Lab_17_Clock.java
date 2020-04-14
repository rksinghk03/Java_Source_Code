package t18Date;

import java.time.Clock;

public class Lab_17_Clock {
	
	  public static void main(String[] args) {  
		    Clock c = Clock.systemDefaultZone();      
		    System.out.println(c.getZone());  
		  }  

}
