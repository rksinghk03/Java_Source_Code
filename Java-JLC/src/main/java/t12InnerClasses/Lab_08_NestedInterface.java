package t12InnerClasses;

interface Showable{  
    void show();  
    interface Message{  
     void msg();  
    }  
  }  
  class Lab_08_NestedInterface implements Showable.Message{  
   public void msg(){System.out.println("Hello nested interface");}  
    
   public static void main(String args[]){  
    Showable.Message message=new Lab_08_NestedInterface();//upcasting here  
    message.msg();  
   }  
  }  