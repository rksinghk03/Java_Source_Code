package t07Array;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[] = {10,11,22,23,34,45,56,67,78,89,90};

int total = 0;
for (int counter=0;counter<array.length;counter++) {
	total  += array[counter];
	//System.out.printf("Total of array elements: %d%n", total);
}

System.out.printf("Total of array elements: %d%n", total);
	}

}
