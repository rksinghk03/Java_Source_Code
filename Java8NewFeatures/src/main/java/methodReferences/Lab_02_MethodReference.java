package methodReferences;
//In the following example, we are using predefined functional interface Runnable to refer static method.

public class Lab_02_MethodReference { 
        public static void ThreadStatus(){  
            System.out.println("Thread is running...");  
        }  
        public static void main(String[] args) {  
            Thread t2=new Thread(Lab_02_MethodReference::ThreadStatus);  
            t2.start();       
        }   

}
