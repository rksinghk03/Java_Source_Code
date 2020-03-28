package t04Polymorphism;

class Shape{
	void draw() {
		System.out.println("Drawing --");
	}
}

class Rectangle  extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle --");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle ---");
	}
}

class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing Triangle ---");
	}
}
public class Lab_21_RuntimePolymorphismShape {

	public static void main(String[] args) {
		Shape s;
		s=new Shape();
		s.draw();
		s=new Triangle();
		s.draw();
		s=new Circle();
		s.draw();
		s=new Rectangle();
		s.draw();
		
		

	}

}
