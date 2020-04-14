package t10JavaMultithreading;

public class Lab_03_SleepMethod1 extends Thread {
	@Override
	public void run() {
		  for(int i=1;i<5;i++){  
			    try{Thread.sleep(500);
			    }
			    catch(InterruptedException e){
			    	System.out.println(e);
			    	}  
			    System.out.println(i);  
			  } 
		
	}

	public static void main(String[] args) {
		Lab_03_SleepMethod1 t1=new Lab_03_SleepMethod1();
		Lab_03_SleepMethod1 t2= new Lab_03_SleepMethod1();
		t1.start();
		t2.start();

	}

	

}
