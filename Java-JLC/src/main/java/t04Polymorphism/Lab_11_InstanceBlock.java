package t04Polymorphism;

class AA{  
AA(){  
	System.out.println("parent class constructor invoked");  
}  
}  
  
class Lab_11_InstanceBlock extends A{  
	Lab_11_InstanceBlock(){  
		super();  
	System.out.println("child class constructor invoked");  
}  
  
	Lab_11_InstanceBlock(int a){  
		super();  
		System.out.println("child class constructor invoked "+a);  
	}  
  
{System.out.println("instance initializer block is invoked");}  
  
public static void main(String args[]){  
	Lab_11_InstanceBlock b1=new Lab_11_InstanceBlock();  
	Lab_11_InstanceBlock b2=new Lab_11_InstanceBlock(10);  
}  
}  

/*
 * public class Lab_11_InstanceBlock {
 * 
 * }
 */
