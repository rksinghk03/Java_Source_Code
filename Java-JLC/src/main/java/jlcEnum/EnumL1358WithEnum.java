package jlcEnum;

public class EnumL1358WithEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using Enum ");
		Course c1=Course.JAVA;
		System.out.println(c1);
		System.out.println(Course.JDBC);
		System.out.println(Course.SERVLETS);
		System.out.println(Course.SPRING);
		Course c2= Course.SPRING;
		c2.setId(4);
		c2.setName("Spring");
		c2.setFacultyName("Dande");
		c2.setDuration(1);
		c2.setFee(3200);
		System.out.println(c2);

			}

		}

		enum Course1{
			
		     JAVA (1, "Java","DK",3,500.0),
			 JDBC (1, "Java","Sri",1,2300.0),
			 SERVLETS(1, "Java","ServletSir",2,3000.0),
			 SPRING;
			
			private int id;
			private String name;
			private String facultyName;
			private int duration;
			private double fee;
			Course1(){}

		private Course1(int id, String name, String facultyName, int duration, double fee) {
			
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

