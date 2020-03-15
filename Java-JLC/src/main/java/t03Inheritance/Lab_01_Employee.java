package t03Inheritance;

class Employee {

    float salary=40000;  
   }  
   class Lab_01_Employee extends Employee{  
    int bonus=10000;  
    public static void main(String args[]){  
    	Lab_01_Employee p=new Lab_01_Employee ();  
      System.out.println("Programmer salary is:"+p.salary);  
      System.out.println("Bonus of Programmer is:"+p.bonus);  
   }  
   }  
