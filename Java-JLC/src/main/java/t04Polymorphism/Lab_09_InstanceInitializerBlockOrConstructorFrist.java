package t04Polymorphism;

public class Lab_09_InstanceInitializerBlockOrConstructorFrist {
	
	Lab_09_InstanceInitializerBlockOrConstructorFrist(){
		System.out.println("Constructor Block----");
	}
	{
		System.out.println("Instance Initializer Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_09_InstanceInitializerBlockOrConstructorFrist d=new Lab_09_InstanceInitializerBlockOrConstructorFrist();
		Lab_09_InstanceInitializerBlockOrConstructorFrist d1=new Lab_09_InstanceInitializerBlockOrConstructorFrist();
		
	}

}
