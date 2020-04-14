package t10JavaMultithreading;

//public class Lab_05_methodDirectly implements Runnable {
public class Lab_05_RunMethod extends Thread {
 public void run() {
	 System.out.println("running");
 }
 
 public static void main(String args[]) {
	// System.out.println("hello main method");
	 Lab_05_RunMethod t1=new Lab_05_RunMethod();
	// t1.start();
	 t1.run();
	 
 }
 
}
