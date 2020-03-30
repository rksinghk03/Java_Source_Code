package t09String;



public final class ImmutableClass{  
final String pancardNumber;  
  
public ImmutableClass(String pancardNumber){  
this.pancardNumber=pancardNumber;  
}  
  
public String getPancardNumber(){  
return pancardNumber;  
}  
  
}
/*
 * public class ImmutableClass extends Employee {
 * 
 * public static void main(String args[]) { System.out.println("hello "); }
 * 
 * }
 */