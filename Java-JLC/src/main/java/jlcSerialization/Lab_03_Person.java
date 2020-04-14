package jlcSerialization;

import java.io.Serializable;  
class Lab_03_Person implements Serializable{  
 int id;  
 String name;  
 Lab_03_Person(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
}  