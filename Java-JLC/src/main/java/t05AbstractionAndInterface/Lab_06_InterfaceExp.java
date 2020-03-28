package t05AbstractionAndInterface;
interface Printable{
	void print();
}


public class Lab_06_InterfaceExp implements Printable{
	
	public void print() {
		System.out.println("Hi how are you");		
	}
	public static void main(String[] args) {
		Lab_06_InterfaceExp n=new Lab_06_InterfaceExp();
		n.print();

	}



}
