package t02ObjectsAndClasses;

public class AnonymousObject {
	public static void main(String args[]){  
		 new Calculation().fact(5);//calling method with anonymous object  
		 new Calculation().fact(7);
		 
		}  

}

class Calculation{  
					 void fact(int  n){  
					  int fact=1;  
					  for(int i=1;i<=n;i++){  
					   fact=fact*i;  
				  }  
					  System.out.println("factorial is "+fact);  
				}  
	} 