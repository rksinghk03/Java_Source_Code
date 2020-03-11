package methodReferences;

//In the following example, we are referring instance (non-static) method. Runnable interface contains only one abstract method. 
//So, we can use it as functional interface.
public class Lab_06_InstanceMethodReferenceNonStaticMethod {
	public void printnMsg() {
		System.out.println("we are referring instance (non-static) method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2=new Thread(new Lab_06_InstanceMethodReferenceNonStaticMethod()::printnMsg);  
        t2.start();       
    
	}

}
