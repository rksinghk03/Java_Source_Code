package t04Polymorphism;

/*public class Lab_28_Downcasting {

}
*/
interface Printable{}  
class AC implements Printable{  
	public void a(){
			System.out.println("a method");
			}  
	}  
class B implements Printable{  
	public void b(){
		System.out.println("b method");
		}  
	}  
  
class Call{  
	void invoke(Printable p){//upcasting  
		if(p instanceof AC){  
				AC a=(AC)p;//Downcasting   
				a.a();  
			}  
		if(p instanceof B){  
		B b=(B)p;//Downcasting   
		b.b();  
		}  
  
	}  
}//end of Call class  
  
class Lab_28_Downcasting{  
public static void main(String args[]){  
Printable p=new B();  
Call c=new Call();  
c.invoke(p);  
}  
}  