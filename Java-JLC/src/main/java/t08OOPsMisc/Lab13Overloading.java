package t08OOPsMisc;

public class Lab13Overloading {
	
	
static int add(int a, int b) {
	int sum2=a+b;
	System.out.println(sum2);
	return sum2;
	
}

static int add(int a, int b, int c) {
	int sum3=(a+b+c);
	System.out.println(sum3);
	return sum3;
	
}

	public static void main(String[] args) {
		Lab13Overloading.add(10,20);
		Lab13Overloading.add(10, 20, 30);

	}

}
