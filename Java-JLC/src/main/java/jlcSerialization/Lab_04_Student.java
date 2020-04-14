package jlcSerialization;


import java.io.Serializable;  
public class Lab_04_Student implements Serializable{  
 int id;  
 String name;  
 Lab_04_Address address;//HAS-A  
 public Lab_04_Student(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
} 