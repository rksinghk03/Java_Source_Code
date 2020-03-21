package jlcAarray;

public class Lab456_Array_Intialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int [3];
		System.out.println("Length="+arr.length);
		for(int i =0;i<arr.length;i++) 
			System.out.println(arr[i]);
		System.out.println("**********************");
		arr[0]=10;arr[1]=20;arr[2]=30;
		for(int i =0;i<arr.length;i++) 
			System.out.println(arr[i]);
		
	}
	

}
