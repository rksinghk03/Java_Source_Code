package jlcAarray;

public class Lab453_Array_Element_Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr1[];
		arr1=new double[3];
		for(int i=0;i<arr1.length;i++)
		System.out.println(arr1[i]);
		System.out.println("Array new double value");
		arr1[0]=20.40;
		arr1[1]=30.05;
		arr1[2]=40.30;
		//arr1[3]=50.00;
		for(int i=0;i<arr1.length;i++)
		System.out.println(arr1[i]);
		
	}

}
