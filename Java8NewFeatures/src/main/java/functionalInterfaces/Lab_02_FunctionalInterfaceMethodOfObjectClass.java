package functionalInterfaces;

@FunctionalInterface  
interface sayable1{  
    void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}  
public class Lab_02_FunctionalInterfaceMethodOfObjectClass implements sayable1{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	Lab_02_FunctionalInterfaceMethodOfObjectClass fie = new Lab_02_FunctionalInterfaceMethodOfObjectClass();  
        fie.say("Hello Functional Interface It can contain any number of Object class methods ");  
    }  
}  