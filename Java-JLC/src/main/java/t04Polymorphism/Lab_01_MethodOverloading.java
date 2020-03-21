package t04Polymorphism;

public class Lab_01_MethodOverloading {

	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(Lab_01_MethodOverloading.add(10, 20));
		System.out.println(Lab_01_MethodOverloading.add(10,20, 30));

	}

}
