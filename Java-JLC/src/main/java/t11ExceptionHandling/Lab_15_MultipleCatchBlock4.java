package t11ExceptionHandling;

public class Lab_15_MultipleCatchBlock4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try{    
              String s=null;  
              System.out.println(s.length());  
             }    
             catch(ArithmeticException e)  
                {  
                 System.out.println("Arithmetic Exception occurs");  
                }    
             catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                }    
             catch(Exception e)  
                {  
                 System.out.println("Parent Exception occurs");  
                }             
             System.out.println("rest of the code");    
  }  
	
/*	In this example, we generate NullPointerException, but didn't provide the corresponding exception type. In such case, 
	the catch block containing the parent exception class Exception will invoked.*/
}
