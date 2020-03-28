package jlcAarray;

public class Lab487_2DArray_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int [3];
		arr[0]=10;arr[1]=15; arr[2]=20;
		System.out.println("Length of 3 = "+arr.length);
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		arr=new int[5];
		System.out.println("Length of 5 = "+arr.length);
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

}
