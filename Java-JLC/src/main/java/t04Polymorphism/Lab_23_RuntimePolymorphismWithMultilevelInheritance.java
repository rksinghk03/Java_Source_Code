package t04Polymorphism;
class Animal23 {
	void eat(){
		System.out.println("Eating --");
	}
}

class Dog23 extends Animal23{
	void eat() {
		System.out.println("Dog is eating bones");
	}
}

class Cat23 extends Animal23{
	void eat() {
		System.out.println("Cat is eating bread");
	}
}
public class Lab_23_RuntimePolymorphismWithMultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal23 a;
		a=new Animal23();
		a.eat();
		
		a=new Dog23();
		a.eat();
		a=new Cat23();
		a.eat();
	}

}
