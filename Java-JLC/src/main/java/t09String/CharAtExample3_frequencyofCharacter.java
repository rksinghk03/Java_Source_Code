package t09String;

public class CharAtExample3_frequencyofCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Welcome to string program ";
		int count =0;
		for(int i=0;i<name.length();i++) {
			char ch =name.charAt(i);
			
			if(ch=='o') {
				count++;
				
			}
		}
		

		System.out.println("count of o ="+count);
	}

}
