package t09String;

public class Lab_28_UseoftoStringMethod {
	
	int id; 
	String name;
	String city;
	public Lab_28_UseoftoStringMethod(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	public static void main(String args[]) {
		System.out.println("Hello use of toString()");
		Lab_28_UseoftoStringMethod n=new Lab_28_UseoftoStringMethod(1,"Raj","lucknow");
		n.toString();
		System.out.println(n);
	}

}
