package methodReferences;
//In the following example, we are referring non-static methods. 
//You can refer methods by class object and anonymous object.
public class Lab_05_ReferencetoInstanceMethod {

	
	public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    public static void main(String[] args) {  
    	Lab_05_ReferencetoInstanceMethod methodReference = new Lab_05_ReferencetoInstanceMethod(); // Creating object  
        // Referring non-static method using reference  
            Sayable sayable = methodReference::saySomething;  
        // Calling interface method  
            sayable.say();  
            // Referring non-static method using anonymous object  
            Sayable sayable2 = new Lab_05_ReferencetoInstanceMethod()::saySomething; // You can use anonymous object also  
            // Calling interface method  
            sayable2.say();  
    }  
}
