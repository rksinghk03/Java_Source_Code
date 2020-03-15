package t03Inheritance;

class Animal2 {
					void eat() {
						System.out.println("Class animal2 is eating");
					}
				}
class Dog2 extends Animal2{
		void bark2() {
					System.out.println("Class Dog2  is barking ");
					}
		}

class Cat extends Animal2{
void meow() {
	System.out.println("Cat meow");
}
}
public  class Lab_04_HierarchicalInheritanceExample {

	public static void main(String[] args) {
		Cat c=new Cat();  
		
		c.meow();  
		c.eat(); 
		
		//System.out.println("Hello");

	}

}
