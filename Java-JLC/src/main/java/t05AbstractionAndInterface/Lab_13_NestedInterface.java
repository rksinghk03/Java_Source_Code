package t05AbstractionAndInterface;

interface Printable13{  
    void print();  
    interface MessagePrintable{  
      void msg();  
    }  
   }  
public class Lab_13_NestedInterface implements Printable13 {
	public void print() {
		System.out.println("hello print");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_13_NestedInterface n=new Lab_13_NestedInterface();
		n.print();
	}

}
