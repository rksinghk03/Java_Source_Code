package t12InnerClasses;
interface Eatable{
	void eat();
}
public class Lab_03_AnnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eatable n=new Eatable() {
			public void eat() {
				System.out.println("Hello fruits");
			}
			
		};
		n.eat();
	}
}