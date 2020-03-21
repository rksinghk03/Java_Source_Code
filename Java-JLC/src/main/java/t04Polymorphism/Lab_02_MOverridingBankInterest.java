package t04Polymorphism;
class Bank{
int getInterest() {
	return 0;
}
}
class SBI extends Bank{
	int getInterest(){
		return 8;
		}
	}

class ICICI extends Bank{
	int getInterest(){
		return 7;
		}
	}

public class Lab_02_MOverridingBankInterest extends Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		System.out.println("SBI getInterest ="+s.getInterest());
		ICICI i=new ICICI();
		System.out.println("ICICI getInterest = "+i.getInterest());

	}

}
