package t05AbstractionAndInterface;
abstract class Shape {
	abstract void draw();
	
}

class Circle extends Shape{
	void draw() {
		System.out.println("Drawing ...circle");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle .....");
	}

}
public class Lab_02_AbstractShapeExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape n=new Circle();
		n.draw();
 
	}



}
