package t05AbstractionAndInterface;
abstract class Bank03{
	abstract double getRateOfInterest ();
}

class SBI extends Bank03{
	double getRateOfInterest() {
		return 7.5;
	}
}

class ICICI extends Bank03{
	
	double getRateOfInterest() {
		return 5.5;
	}
	
}
public class Lab_03_AbstractClassBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Bank03 n;
    n= new SBI();
    n.getRateOfInterest();
    n=new ICICI();
    n.getRateOfInterest();
     
	}

}
