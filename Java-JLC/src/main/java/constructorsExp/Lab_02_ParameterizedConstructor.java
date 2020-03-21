package constructorsExp;

public class Lab_02_ParameterizedConstructor {
	int id;
	String name;
	
	Lab_02_ParameterizedConstructor(int i , String n){
	                id=i;
	                name=n;
		  }
	void dispaly () {
		System.out.println(id +" " +name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_02_ParameterizedConstructor n=new Lab_02_ParameterizedConstructor(101, "ram");
		Lab_02_ParameterizedConstructor m =new Lab_02_ParameterizedConstructor(102, "mohan");
		n.dispaly();
		m.dispaly();
	}

}
