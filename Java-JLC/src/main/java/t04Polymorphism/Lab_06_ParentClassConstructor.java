package t04Polymorphism;

class Animal1{
	 Animal1() {
		System.out.println("Animal class created ---");
	}
}
class Dog1 extends Animal1{
	Dog1() {
		super();
		System.out.println("Dog is created ");
	}
	
	
}
public class Lab_06_ParentClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog1 d =new Dog1();
	}

}
