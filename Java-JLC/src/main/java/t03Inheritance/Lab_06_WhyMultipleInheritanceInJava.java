package t03Inheritance;

class A6{
void msg(){
		System.out.println("hello");
	}
}
class B6{
	void msg() {
		System.out.println("Welcome");
	}
}
public class Lab_06_WhyMultipleInheritanceInJava extends A6,B6 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lab_06_WhyMultipleInheritanceInJava c=new Lab_06_WhyMultipleInheritanceInJava();
		c.msg();
	}

}
