package t05AbstractionAndInterface;
interface Printable1{
	void print();
}

interface Showcase{
	void show1();
}
public class Lab_09_MultipleInheritance implements Printable1, Showcase {
	public void print() {
		System.out.println("hello print how are u");
	}
	public void show1() {
		System.out.println("Hi show 1 how are you");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_09_MultipleInheritance n =new Lab_09_MultipleInheritance();
		n.print();
		n.show1();
	}

}
