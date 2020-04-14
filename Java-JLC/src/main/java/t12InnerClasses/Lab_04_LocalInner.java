package t12InnerClasses;

public class Lab_04_LocalInner{  
    private int data=30;//instance variable  
    void display(){  
     class Local{  
      void msg(){System.out.println(data);}  
     }  
     Local l=new Local();  
     l.msg();  
    }  
    public static void main(String args[]){  
    	Lab_04_LocalInner obj=new Lab_04_LocalInner();  
     obj.display();  
    }  
   }  