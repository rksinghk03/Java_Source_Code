package recursion;

public class Fibbonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int fibb1=0;
	int fibb2=1;
	int fibb3;
	System.out.println(fibb1+"  "+fibb2+ "");
	for(int i=3;i<=10;i++) {
		fibb3=fibb2+fibb1;
		System.out.println(fibb3+" ");
		fibb1=fibb2;
		fibb2=fibb3;
	}
	
	}
	
	public static int fibb(int n)
	{
		if(n==1) {
			return 0;
		}
		else if(n==2) {
			return 1;
		}
		else {
		return fibb(n-1)+fibb(n-2);
		}
	}
}
