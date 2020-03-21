package constructorsExp;

public class Lab_04_CopyConstructor {
int id;
String name;

	Lab_04_CopyConstructor(int i, String n){
		id=i;
		name=n;
	}
	Lab_04_CopyConstructor(Lab_04_CopyConstructor o){
		id=o.id;
		name=o.name;
		
	}
	
	void display() {
		System.out.println(id+ "  " +name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_04_CopyConstructor o=new Lab_04_CopyConstructor(1001,"Moni");
       Lab_04_CopyConstructor o1 =new Lab_04_CopyConstructor(o);
		o.display();
		o1.display();
		

	}

}
