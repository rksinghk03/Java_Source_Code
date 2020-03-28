package t04Polymorphism;
class Animal25{
	void eat() {
		System.out.println("Animal is eating -----");
	}
}
public class Lab_25_DynamicBinding extends Animal25 {
void eat() {
	System.out.println("Dog is eating ");
}
	public static void main(String[] args) {
		Animal25 n=new Lab_25_DynamicBinding();
		n.eat();
		

	}

}
