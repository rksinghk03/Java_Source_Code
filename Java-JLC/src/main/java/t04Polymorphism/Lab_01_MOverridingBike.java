package t04Polymorphism;
class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
	
}
public class Lab_01_MOverridingBike extends Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_01_MOverridingBike n=new Lab_01_MOverridingBike();
      n.run();
	}

}
