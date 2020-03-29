package t07Array;

public class Lab_04_AnonymousArray {

	void show(int arr[]) {
		for(int i=0; i<arr.length;i++) {
		System.out.println("Array values= "+arr[i]);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_04_AnonymousArray n =new Lab_04_AnonymousArray();
		n.show(new int [] {10, 20, 30, 40});
	}

}
