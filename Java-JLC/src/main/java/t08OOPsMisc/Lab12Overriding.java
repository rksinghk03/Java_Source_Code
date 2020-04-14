package t08javaOOPsMisc;

class Dog {
	
	void eat() {
		System.out.println("Class DOg eating");
	}

}

public class Lab12Overriding extends Dog {
	
	void eat() {
		super.eat();
		System.out.println("class Dog eating bread...");
	}
	
			public static void main(String args[]) {
			Dog obj=new Dog();
			obj.eat();
			//super.eat();
		}
	}
