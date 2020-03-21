package jlcAarray;

public class Lab452_Array_Element_Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[];
arr1 =new int[3];
for(int i=0;i<arr1.length;i++) 
	System.out.println(arr1[i]);
	System.out.println("new value of Array");
	arr1[0]=10;
	arr1[1]=20;
	arr1[2]=30;
	for(int i=0;i<arr1.length;i++) 
	System.out.println(arr1[i]);
	

	}

}
