package t04Polymorphism;
class Animal2{
	Animal2(){
		System.out.println("Hello Animal2 created");
	}
}
class Dog2 extends Animal2{
	Dog2(){
		System.out.println("Hello Dog class is created");
	}
}
public class Lab_06_SuperMethodCompileImplicitly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog2 d=new Dog2();

	}

}
