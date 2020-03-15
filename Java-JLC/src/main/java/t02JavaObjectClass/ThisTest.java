package t02JavaObjectClass;

// Fig. 8.4: ThisTest.java
// this used implicitly and explicitly to refer to members of an object.

public class ThisTest 
{
   public static void main(String[] args)
   {
      SimpleTime time = new SimpleTime(15, 30, 19);
      System.out.println(time.buildString());
   } 
} // end class ThisTest




