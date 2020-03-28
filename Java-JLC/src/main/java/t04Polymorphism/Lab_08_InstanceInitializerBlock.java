package t04Polymorphism;

public class Lab_08_InstanceInitializerBlock {
int speed;
Lab_08_InstanceInitializerBlock(){
	System.out.println("speed ="+speed);
}
{speed=100;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_08_InstanceInitializerBlock b=new Lab_08_InstanceInitializerBlock();
		Lab_08_InstanceInitializerBlock b1=new Lab_08_InstanceInitializerBlock();
	}

}
