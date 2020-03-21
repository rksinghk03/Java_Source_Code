package constructorsExp;

public class Lab_01_StaticVariable {
	int id;
	String name;
	//String collage= "ITS";
	String collage= "BJS";
	
	Lab_01_StaticVariable(int i, String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println("Details of student = "+id +" "+name+" "+collage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_01_StaticVariable s=new Lab_01_StaticVariable(101,"Jhon");
		Lab_01_StaticVariable s1=new Lab_01_StaticVariable(102,"Kiran");
		s.display();
		s1.display();
		
	}

}
