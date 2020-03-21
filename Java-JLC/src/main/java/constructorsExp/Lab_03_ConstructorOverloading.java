package constructorsExp;

public class Lab_03_ConstructorOverloading {
	
	int id;
	String name;
	int age;
	 Lab_03_ConstructorOverloading(int i, String n){
		id=i;
		name=n;
	
	}
	 Lab_03_ConstructorOverloading(int i, String n, int a) {
		id=i;
		name=n;
		age=a;
	}

	void display1() {
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_03_ConstructorOverloading c=new Lab_03_ConstructorOverloading(1, "ram");
		Lab_03_ConstructorOverloading c1=new Lab_03_ConstructorOverloading(2,"Sita",23);
		c.display1();
		c1.display1();
		

	}

}
