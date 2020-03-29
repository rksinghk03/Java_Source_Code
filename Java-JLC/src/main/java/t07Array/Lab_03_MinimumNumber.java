package t07Array;

public class Lab_03_MinimumNumber {
	static void  min(int arr[]) {
		int min =arr[0];
	
			for(int i=0;i<arr.length;i++) {
				if(min>arr[i]) {
					min=arr[i];
					System.out.println("minimum number = "+min);
				}
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {33,78,5,6,8,9};
		min(a);

	}

}
