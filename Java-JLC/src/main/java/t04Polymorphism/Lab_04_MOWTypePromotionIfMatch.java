package t04Polymorphism;

public class Lab_04_MOWTypePromotionIfMatch {
	void sum(int a,int b){System.out.println("int arg method invoked");}  
	void sum(long a,long b){System.out.println("long arg method invoked");} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_04_MOWTypePromotionIfMatch n=new Lab_04_MOWTypePromotionIfMatch();
		n.sum(10, 20);
		n.sum(303033333, 303003333);
		

	}

}
