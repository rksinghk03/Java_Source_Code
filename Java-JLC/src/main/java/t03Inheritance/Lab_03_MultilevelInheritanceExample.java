package t03Inheritance;

class Animal1{
	void eat() {
		System.out.println("Eating class Animal1 --");
	}
}
class Dog1 extends Animal1{
	void bark() {
		System.out.println("Bradking class Dog1 ---");
	}
}

class BabyDog extends Dog1{
	void weep() {
		System.out.println("Weeping --");
	}
}
public class Lab_03_MultilevelInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog bd=new BabyDog();
		bd.weep();
		bd.bark();
		bd.eat();
	}

}
