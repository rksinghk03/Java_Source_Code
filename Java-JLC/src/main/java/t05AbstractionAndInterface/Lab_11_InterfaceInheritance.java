package t05AbstractionAndInterface;
interface Printable11{
	void print();
	
}
interface Showable11 extends Printable11{
	void show();
	
}
public class Lab_11_InterfaceInheritance implements Printable11,Showable11 {
public void show() {
	System.out.println("Hi show");
}
public void print() {
	System.out.println("Hi print");
}
	public static void main(String[] args) {
		Lab_11_InterfaceInheritance n =new Lab_11_InterfaceInheritance();
		n.show();
		n.print();

	}

}
