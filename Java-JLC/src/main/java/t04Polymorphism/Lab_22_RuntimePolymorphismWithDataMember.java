package t04Polymorphism;
class Bike22{
	int speedlimit=20;
	
}
public class Lab_22_RuntimePolymorphismWithDataMember extends Bike22{
	int speedlimit=90;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lab_22_RuntimePolymorphismWithDataMember m= new Lab_22_RuntimePolymorphismWithDataMember();
		Bike22 n= new Lab_22_RuntimePolymorphismWithDataMember();
		//System.out.println("Main class member= "+speedlimit); // if we want acceess data member in this class we need to make as static
		System.out.println("Bike22 data member" +n.speedlimit);
		
	}

}
