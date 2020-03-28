package t05AbstractionAndInterface;

interface Drawable{
	void draw();
}
class Rectangle1 implements Drawable{
	public void draw() {
		System.out.println("Drawable rectangle");
		
	}
}
class Circle1 implements Drawable{
	public void draw() {
		System.out.println("Drawable circle");
	}
}

public class Lab_07_InterfaceDrawable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable n=new Circle1();
		n.draw();
		Drawable n1=new Rectangle1 ();
		n1.draw();
	}

}
