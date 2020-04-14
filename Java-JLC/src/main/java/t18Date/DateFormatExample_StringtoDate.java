package t18Date;

import java.text.DateFormat;  
import java.util.Date;  

public class DateFormatExample_StringtoDate {  
	    public static void main(String[] args)throws Exception {  
	        Date d = DateFormat.getDateInstance().parse("24 Mar, 2015");  
	        System.out.println("Date is: "+d);  
	    } 
}
