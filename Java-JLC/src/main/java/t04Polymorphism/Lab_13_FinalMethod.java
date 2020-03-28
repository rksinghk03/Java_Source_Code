package t04Polymorphism;

class Bike13{
	final void run() {
		System.out.println("Hello Bike 13 class");
	}
}


public class Lab_13_FinalMethod extends Bike13 {

	void run() {
		System.out.println("Running under child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_13_FinalMethod n=new Lab_13_FinalMethod();
		n.run();

	}

}
