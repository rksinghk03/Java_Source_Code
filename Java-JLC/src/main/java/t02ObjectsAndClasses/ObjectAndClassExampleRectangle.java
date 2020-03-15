package t02ObjectsAndClasses;
class Rectangle{  
	 int length;  
	 int width;  
	 void insert(int l, int w){  
	  length=l;  
	  width=w;  
	 }  
	 void calculateArea(){System.out.println("Area of Rectangle is = "+(length*width));}  
	}  
public class ObjectAndClassExampleRectangle{ 
	 public static void main(String args[]){  
	  Rectangle r1=new Rectangle();  
	  Rectangle r2=new Rectangle();  
	  r1.insert(11,5);  
	  r2.insert(3,15);  
	  r1.calculateArea();  
	  r2.calculateArea();  
	}  
}  
	
