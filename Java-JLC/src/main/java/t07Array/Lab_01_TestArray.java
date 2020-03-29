package t07Array;

public class Lab_01_TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array=new int [5];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
		for(int i=0; i<array.length;i++) {
			
			System.out.println("Array values = "+array[i]);
		}
		int [] array1= {60, 70, 80};
		for(int  j=0;j<array1.length;j++) {
			System.out.println("Array1="+array1[j]);
		}
		
		

	}

}
