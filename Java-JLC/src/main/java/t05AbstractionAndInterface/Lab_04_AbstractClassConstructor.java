package t05AbstractionAndInterface;
abstract class Bike {
	Bike(){
		System.out.println("Bike class constructor");
	}
	 abstract void run();  
	   void changeGear(){
		   System.out.println("gear changed");
		   }
}

class Honda extends Bike{
	void run() {
		System.out.println("Honda bike is runing safely ");
	}
}

public class Lab_04_AbstractClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Bike n=new Honda();
 n.run();
 n.changeGear();
	}

}
