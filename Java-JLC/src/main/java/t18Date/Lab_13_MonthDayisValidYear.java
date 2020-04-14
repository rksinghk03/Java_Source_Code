package t18Date;

import java.time.MonthDay;

public class Lab_13_MonthDayisValidYear {
	public static void main(String[] args) {  
	    MonthDay month = MonthDay.now();  
	    boolean b = month.isValidYear(2012);  
	    System.out.println(b);  
	  } 
}
