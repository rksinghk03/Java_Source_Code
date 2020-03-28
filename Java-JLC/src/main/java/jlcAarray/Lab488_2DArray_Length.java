package jlcAarray;

public class Lab488_2DArray_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int [3];
		arr[0]=10;arr[1]=15; arr[2]=20;
		int arr2[]= arr;
		System.out.println("Length of arr = "+arr.length);
		System.out.println("Length of arr2 = "+arr2.length);
		
		arr=new int[5];
		System.out.println("Length of new arr = "+arr.length);
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);
	}

}
