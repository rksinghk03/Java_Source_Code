package functionalInterfaces;
@FunctionalInterface
interface sayable{
	void say(String msg);
}
public class Lab_01_FunctionalInterface implements sayable {
	
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	Lab_01_FunctionalInterface fie = new Lab_01_FunctionalInterface();  
        fie.say("Hello there");  
    }

}
