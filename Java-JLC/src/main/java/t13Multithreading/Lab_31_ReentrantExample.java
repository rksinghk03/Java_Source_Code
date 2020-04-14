package t13Multithreading;
class Reentrant {  
    public synchronized void m() {  
    n();  
    System.out.println("this is m() method");  
    }  
    public synchronized void n() {  
    System.out.println("this is n() method");  
    }  
}  

public class Lab_31_ReentrantExample extends Reentrant{
    
	public static void main(String args[]){  
		final Lab_31_ReentrantExample re=new Lab_31_ReentrantExample();  
		  
		Thread t1=new Thread(){  
		public void run(){  
		re.m();//calling method of Reentrant class  
		}  
		};  
		t1.start();  
		}
}
