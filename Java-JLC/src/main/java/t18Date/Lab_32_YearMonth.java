package t18Date;

import java.time.Period;
import java.time.YearMonth;

public class Lab_32_YearMonth {
	public static void main(String[] args) {  
	    YearMonth ym1 = YearMonth.now();  
	    YearMonth ym2 = ym1.plus(Period.ofYears(2));  
	    System.out.println("YearMonth plus() = "+ym2); 
	    YearMonth ym3 = ym1.minus(Period.ofYears(2));  
	    System.out.println("YearMonth minus()= "+ym3);
	}
}
