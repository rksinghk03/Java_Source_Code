package t04Polymorphism;
class Animal27{
	void show() {
		System.out.println("Hello Animal27");
	}
	
}

class Dog27 extends Animal27{
	void show1() {
		System.out.println("Hello Dog 27 class");
	}
}

public class Lab_27_InstanceOfOperator extends Dog27{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog27 d =new Dog27();
		System.out.println(d instanceof Dog27);
		Dog27 d1 =new Lab_27_InstanceOfOperator (); 
		System.out.println(d1 instanceof Lab_27_InstanceOfOperator);
	}

}
