package t05AbstractionAndInterface;
interface Printable10{
	void print();
	
}

interface Showable10{
	void print();	
}

public class Lab_10_MultipleInheritance implements Printable10,Showable10  {
public void print() {
	System.out.println("Hi printing ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_10_MultipleInheritance n=new Lab_10_MultipleInheritance();
		n.print();
	}

}
