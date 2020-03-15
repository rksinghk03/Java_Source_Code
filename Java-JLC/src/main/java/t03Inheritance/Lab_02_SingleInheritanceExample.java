package t03Inheritance;
class Animal{
	void eat(){
		System.out.println("Eating --");
	}
	
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking----");
	}
}
public class Lab_02_SingleInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lab_02_SingleInheritanceExample obj=new Lab_02_SingleInheritanceExample();
		Dog d =new Dog();
		d.bark();
		d.eat();
	}

}
