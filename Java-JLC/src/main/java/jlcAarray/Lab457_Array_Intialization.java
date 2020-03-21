package jlcAarray;

public class Lab457_Array_Intialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] =new String [3];
		System.out.println("Length="+arr.length);
		for(int i =0;i<arr.length;i++) 
			System.out.println(arr[i]);
		System.out.println("**********************");
		arr[0]="Java";	arr[1]="Learning"; arr[2]="Center";
		for(int i =0;i<arr.length;i++) 
			System.out.println(arr[i]);
		
	}
}
