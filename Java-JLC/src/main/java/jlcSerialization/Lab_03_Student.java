package jlcSerialization;

class Lab_03_Student extends Lab_03_Person{  
	 String course;  
	 int fee;  
	 public Lab_03_Student(int id, String name, String course, int fee) {  
	  super(id,name);  
	  this.course=course;  
	  this.fee=fee;  
	 }  
}