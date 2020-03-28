package t05AbstractionAndInterface;
abstract class Bike1{
	
	abstract void run();
}
public class Lab_01_AbstractClass extends Bike1{
  void run() {
	  System.out.println("Hi..... how are you!");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_01_AbstractClass n = new Lab_01_AbstractClass();
		n.run();
	}

}
