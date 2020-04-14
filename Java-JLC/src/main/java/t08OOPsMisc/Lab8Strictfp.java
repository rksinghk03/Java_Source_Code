package t08javaOOPsMisc;

public strictfp class Lab8Strictfp {
	//Java strictfp keyword ensures that you will get the same result on every platform if you perform operations in the floating-point variable.
	
	// The strictfp keyword can be applied on methods, classes and interfaces.
	
	int data =50;
	 strictfp void change(Lab7CallbyValue obj) {
		obj.data=obj.data+100;
	}

	public static void main(String[] args) {
		
		Lab7CallbyValue obj=new Lab7CallbyValue();
		
		System.out.println("before change "+obj.data);  
		   obj.change(obj);//passing object  
		   System.out.println("after change "+obj.data);  
	}

}
