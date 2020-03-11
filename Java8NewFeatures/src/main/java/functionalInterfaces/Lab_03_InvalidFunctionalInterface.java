package functionalInterfaces;

interface sayable11{  
    void say(String msg);   // abstract method  
}  
@FunctionalInterface  
interface Lab_03_InvalidFunctionalInterface extends sayable11{  
    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
    void doIt();  
} 

