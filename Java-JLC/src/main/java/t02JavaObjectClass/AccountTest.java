package t02JavaObjectClass;

// Fig. 3.2: AccountTest.java
// Creating and manipulating an Account object.
import java.util.Scanner;

public class AccountTest
{
   public static void main(String[] args)
   { 
      // create a Scanner object to obtain input from the command window
      Scanner input = new Scanner(System.in);

      // create an Account object and assign it to myAccount
      Account Account1 = new Account("Rajkumar"); 
      Account Account2 = new Account("Amit"); 

      // display initial value of name (null)
      System.out.printf("Initial name is: %s%n%n", Account1.getName());

      // prompt for and read name
      System.out.println("Please enter the name:");
      String theName = input.nextLine(); // read a line of text
      Account1.setName(theName); // put theName in myAccount
      System.out.println(); // outputs a blank line

      // display the name stored in object myAccount
      System.out.printf("Name in object myAccount is:%n%s%n",
         Account1.getName());
   } 
} // end class AccountTest

