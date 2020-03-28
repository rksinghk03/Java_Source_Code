package t04Polymorphism;



class Animal29 { }  

class Lab_29_DowncastingWithInstanceof extends Animal29 {  
  static void method(Animal29 a) {  
    if(a instanceof Lab_29_DowncastingWithInstanceof){  
    	Lab_29_DowncastingWithInstanceof d=(Lab_29_DowncastingWithInstanceof)a;//downcasting  
       System.out.println("ok downcasting performed");  
    }  
  }  
   
  public static void main (String [] args) {  
    Animal29 a=new Lab_29_DowncastingWithInstanceof();  
    Lab_29_DowncastingWithInstanceof.method(a);  
  }  
  
}