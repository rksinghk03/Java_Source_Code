package t04Polymorphism;

public class Lab_02_MethodOverloadingChangingDataType {
 static int add(int a , int b) {
	 return a+b;
 }
 static float add(float a, float b) {
	 return a+b;
 }
	public static void main(String args[]) {
		System.out.println("hello");
		System.out.println(Lab_02_MethodOverloadingChangingDataType.add(10, 20));
		System.out.println(Lab_02_MethodOverloadingChangingDataType.add(10.0f, 40.0f));
		
	}

}
