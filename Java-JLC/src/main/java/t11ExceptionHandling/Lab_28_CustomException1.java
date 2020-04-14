package t11ExceptionHandling;

public class Lab_28_CustomException1 {

	public void valid(int age) {
		if(age>18) {
			System.out.println("welocme ..you can vote!");
		}
		else {
			System.out.println("you can not vote !");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_28_CustomException1 o1=new Lab_28_CustomException1();
		try {
		o1.valid(13);
	}
		catch(Exception e){
			System.out.println(e);
			
		}
	}
}

class InvalidAgeException extends Exception{  
    InvalidAgeException(String s){  
    	System.out.println("hello InvalidAgeException ");
     //super(s);  
    }  
   } 