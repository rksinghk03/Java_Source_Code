package t04Polymorphism;
interface Printable1{}  
class A30 implements Printable1{  
public void a(){System.out.println("a method");}  
}  
class BB implements Printable{  
public void b(){System.out.println("b method");}  
}  
  
class Call1{  
			void invoke(Printable p){//upcasting  
			if(p instanceof A30){  
				A30 a=(A30)p;//Downcasting   
			a.a();  
			}  
			if(p instanceof B){  
			BB b=(BB)p;//Downcasting   
			b.b();  
			}  
  
		}  
}//end of Call class  
  
	class Lab_30_RealUseofInstanceof{  
		public static void main(String args[]){  
			Printable p=new BB();  
			Call1 c=new Call1();  
			c.invoke(p);  
		}  
}  