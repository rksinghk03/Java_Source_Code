package t09String;

class Lab_27_ProblemWithouttoStringMethod{  
    int rollno;  
    String name;  
    String city;  
     
    Lab_27_ProblemWithouttoStringMethod(int rollno, String name, String city){  
    this.rollno=rollno;  
    this.name=name;  
    this.city=city;  
    }  
     
    public static void main(String args[]){  
    	Lab_27_ProblemWithouttoStringMethod s1=new Lab_27_ProblemWithouttoStringMethod(101,"Raj","lucknow");  
    	Lab_27_ProblemWithouttoStringMethod s2=new Lab_27_ProblemWithouttoStringMethod(102,"Vijay","ghaziabad");  
        
      System.out.println(s1);//compiler writes here s1.toString()  
      System.out.println(s2);//compiler writes here s2.toString()  
    }  
   }  