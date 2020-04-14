package t18Date;

import java.time.*;  
import java.time.temporal.*;  
public class Lab_37_MonthEnumExample {  
    public static void main(String[] args) {  
        Month month = Month.valueOf("January".toUpperCase());  
        System.out.printf("For the month of %s all Sunday are:%n", month);  
        LocalDate localdate = Year.now().atMonth(month).atDay(1).  
        with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));  
        Month mi = localdate.getMonth();  
        while (mi == month) {  
            System.out.printf("%s%n", localdate);  
            localdate = localdate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));  
            mi = localdate.getMonth();  
            
            System.out.println("Java Month enum Example: getValue method");
            Month month1 = Month.from(LocalDate.now());  
            System.out.println(month1.getValue());  
            System.out.println(month1.name());
            System.out.println("Java Month enum Example: minus method");
            Month month3 = Month.from(LocalDate.now());    
            System.out.println(month3.minus(2)); 
            System.out.println("Java Month enum Example: plus");
            Month month4 = Month.from(LocalDate.now());    
            System.out.println(month4.plus(2)); 
            
            System.out.println("Java Month enum Example: length method");
            Month mlength = Month.from(LocalDate.now());    
            System.out.println("Total Number of days: "+mlength.length(true));  
        }  
    }  
}