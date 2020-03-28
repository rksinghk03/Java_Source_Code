package jlcEnum;

public class EnumL1356 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(" Without enum use");
Course c1=Course.JAVA;
System.out.println(c1);
System.out.println(Course.JDBC);
System.out.println(Course.SERVLETS);
System.out.println(Course.SPRING);
Course c2= Course.SPRING;
c2.setId(4);
c2.setName("Spring");
c2.setFacultyName("Dande");
c2.setDuration(2);
c2.setFee(5000);
System.out.println(c2);

	}

}

class Course{
	
	
	public static Course JAVA=new Course(1, "Java","DK",3,500.0);
	public static Course JDBC=new Course(1, "Java","Sri",1,2300.0);
	public static Course SERVLETS=new Course(1, "Java","ServletSir",2,3000.0);
	public static Course SPRING=new Course(1, "Java","SpringSir",1, 600.0);
	
	private int id;
	private String name;
	private String facultyName;
	private int duration;
	private double fee;
	Course(){}

public Course(int id, String name, String facultyName, int duration, double fee) {
	
	this.id=id;
	this.name=name;
	this.facultyName=facultyName;
	this.duration=duration;
	this.fee=fee;	
	
	
}


	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", facultyName=" + facultyName + ", duration=" + duration
				+ ", fee=" + fee + "]";
	}



}



