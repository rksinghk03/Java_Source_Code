package jlcOOPS;

public class Lab544_Class {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.show();
		Customer c2 =new Customer();
		c2.cid=99;
		c2.cName="Rajkumar";
		c2.cphone= 91919191;
		c2.show();
	}

}
class Customer{
	int cid;
	String cName;
	long cphone;
	void show() {
		System.out.println("Customer name =" +cid);
		System.out.println("Customer name = "+cName);
		System.out.println("Customer phone = "+cphone);
	}
}