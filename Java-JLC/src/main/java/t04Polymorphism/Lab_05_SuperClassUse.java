package t04Polymorphism;
class Animal{
	void eat() {
		System.out.println("Eating -- from Animal class ");
	}
}

class Dog extends Animal{
	void eat(){System.out.println("eating bread...");}  
	void bark(){System.out.println("barking...");}  
	void work(){  
	super.eat();  
	bark();  
	
}
}
public class Lab_05_SuperClassUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		//d.eat();
		d.work();
	}

}
