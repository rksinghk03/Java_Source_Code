package t05AbstractionAndInterface;
interface Bank{
	float rateOfInterest();
}

class SBI8 implements Bank{
	public float rateOfInterest() {
		
		return 9.5f;
	}
}

class ICICI8 implements Bank{
	public float rateOfInterest() {
		return 7.5f;
	}
}
public class Lab_08_InterfaceBankexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bank n=new SBI8();
	System.out.println("SBI rate of intrest = "+n.rateOfInterest());
	Bank n1=new ICICI8();
	System.out.println("ICICI rate of intrest = "+n1.rateOfInterest());
	

	}

}
