package t08javaOOPsMisc;

public class ObjectClonningTest implements Cloneable {
	private String name;
	private int id;


	void addStudent(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String...args) throws CloneNotSupportedException {
		System.out.println("hello main class methos");
		/*ObjectClonningTest obj1=new ObjectClonningTest();
		obj1.addStudent(101, "Amit");
		ObjectClonningTest obj2 = (ObjectClonningTest)obj1.clone();
		System.out.println(obj1.id +" " +obj1.name);
		System.out.println(obj2.id+""+obj2.name);*/
		ObjectClonningTest obj1=new ObjectClonningTest();
		obj1.addStudent(101, "Amit");
		System.out.println(obj1.id +" " +obj1.name);
		
		obj1.myDream(obj1);
		
		
		System.out.println(obj1.id +" " +obj1.name);
		
		//*********************************************************
		int a=10;
		System.out.println(a);
		obj1.myLove(a);
		System.out.println(a);
		
		
		
		
		
	}
	void myDream(ObjectClonningTest x) {
		x.id=20;
		x.name="My Life";
		
		
	}
	void myLove(int x) {
		x=30;
		
		
	}

}
