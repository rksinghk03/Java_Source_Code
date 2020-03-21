package t04Polymorphism;
class Vehicle1{
	void run() {
		System.out.println("Vehicle is running");
	}
	
}

public class Lab_01_MOverridingBike2 extends Vehicle1 {
 void run() {
	 System.out.println("Bike  is running safely ");
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_01_MOverridingBike2 n=new Lab_01_MOverridingBike2();
		n.run();

	}

}
