package t10JavaMultithreading;

public class Lab_09_GetSetThread extends Thread{
	public void run() {
		System.out.println("hello run thread is running ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_09_GetSetThread n =new Lab_09_GetSetThread();
		Lab_09_GetSetThread n1=new Lab_09_GetSetThread();
		n.start();
		n1.start();
		System.out.println(n.getName());
		System.out.println(n.getName());
		n.setName("raj");
		System.out.println(n.getName());
	}

}
