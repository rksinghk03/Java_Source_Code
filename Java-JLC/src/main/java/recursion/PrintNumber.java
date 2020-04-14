package recursion;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFirstNumer(20);
		
	}
	
	public static void printFirstNumer(int n) {
		if(n>1) {
			printFirstNumer(n-1);
		}
		System.out.println(n+" ");
	}

}
