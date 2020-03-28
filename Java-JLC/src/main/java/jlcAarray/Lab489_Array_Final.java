package jlcAarray;

public class Lab489_Array_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final int arr[]=new int [2];
		
		System.out.println("Length of arr = "+arr.length);
		System.out.println("Value of arr = "+arr[0]);
		System.out.println("Value of arr2 = "+arr[1]);
		System.out.println();
		
		arr[0]=99;
		arr[1]=88;
		System.out.println("After new value = ");
		System.out.println("Value of arr = "+arr[0]);
		System.out.println("Value of arr2 = "+arr[1]);
	}

}
