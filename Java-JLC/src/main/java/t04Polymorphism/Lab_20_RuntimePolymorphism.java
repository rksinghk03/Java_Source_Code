package t04Polymorphism;
class Bike20{
	void run() {
		System.out.println("Bike20 is running with 90 KM");
	}
}
public class Lab_20_RuntimePolymorphism extends Bike20{
void run() {
	System.out.println("Honda is running with 120 KM");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Lab_20_RuntimePolymorphism n=new Lab_20_RuntimePolymorphism();
		n.run();
		Bike20 n1=new Lab_20_RuntimePolymorphism();
		n1.run();
		Bike20 n2=new Bike20();
		n2.run();
	}

}
