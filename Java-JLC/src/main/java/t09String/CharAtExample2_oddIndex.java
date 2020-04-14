package t09String;

public class CharAtExample2_oddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Java how are you";
		for(int i=0; i<name.length();i++) {
			if(i%2!=0) {
				System.out.println("Char at "+i+" place "+name.charAt(i));
			}
				
		}

	}

}
