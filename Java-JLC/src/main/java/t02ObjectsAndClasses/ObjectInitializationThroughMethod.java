package t02ObjectsAndClasses;

public class ObjectInitializationThroughMethod {
	
	 public static void main(String args[]){  
		 StudentInfo s1=new StudentInfo();  
		 StudentInfo s2=new StudentInfo();  
		  s1.insertRecord(111,"Karan");  
		  s2.insertRecord(222,"Aryan");  
		  s1.displayInformation();  
		  s2.displayInformation();  
		 } 

}
