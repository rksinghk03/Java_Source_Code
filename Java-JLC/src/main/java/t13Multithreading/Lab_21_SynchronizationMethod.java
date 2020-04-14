package t13Multithreading;

class Table6{  
	 synchronized void printTable(int n){//synchronized method  
	   for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	class MyThread6 extends Thread{  
			Table6 t;  
			MyThread6(Table6 obj){  
			this.t=obj;  
	}  
	public void run(){  
		t.printTable(5);  
		}  
	  
	}  
	class MyThread7 extends Thread{  
		Table6 t;  
		MyThread7(Table6 t){  
			this.t=t;  
	}  
	public void run(){  
	t.printTable(100);  
	}  
	}  
	  
	public class Lab_21_SynchronizationMethod{  
		public static void main(String args[]){  
			Table6 obj = new Table6();//only one object  
			MyThread6 t1=new MyThread6(obj);  
			MyThread7 t2=new MyThread7(obj);  
	t1.start();  
	t2.start();  
	}  
	} 