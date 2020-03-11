package functionalInterfaces;

interface Doable1{  
    default void doIt(){  
        System.out.println("a functional interface is extending to a non-functional interface");  
    }  
}  
@FunctionalInterface  
interface Sayable4 extends Doable1{  
    void say(String msg);   // abstract method  
}  
public class Lab_04_NonFunctionalInterface implements Sayable4{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	Lab_04_NonFunctionalInterface fie = new Lab_04_NonFunctionalInterface();  
        fie.say("Hello there");  
        fie.doIt();  
    } 
}