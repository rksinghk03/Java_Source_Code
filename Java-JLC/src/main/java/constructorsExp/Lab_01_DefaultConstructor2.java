package constructorsExp;

public class Lab_01_DefaultConstructor2 {
		int id; 
		String name;
		void display() {
			System.out.println(id +" " +name);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_01_DefaultConstructor2 s1=new Lab_01_DefaultConstructor2();
		Lab_01_DefaultConstructor2 s2=new Lab_01_DefaultConstructor2();
		s1.display();
		s2.display();
		
	}

}
