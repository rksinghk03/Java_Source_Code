package t18Date;

import java.time.Clock;

public class Lab_19_ClocksystemUTC {
	 public static void main(String[] args) {  
		    Clock c = Clock.systemUTC();  
		    System.out.println(c.instant());  
		  }  

}
