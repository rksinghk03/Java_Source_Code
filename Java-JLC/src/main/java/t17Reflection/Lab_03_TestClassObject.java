package t17Reflection;  
interface My{}  
  
class Lab_03_TestClassObject{  
 public static void main(String args[]){  
  try{  
   Class c=Class.forName("Test");  
   System.out.println(c.isInterface());  
     
   Class c2=Class.forName("My");  
   System.out.println(c2.isInterface());  
    
  }catch(Exception e){System.out.println(e);}  
  
 }
}