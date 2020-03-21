package jlcAarray;

public class Lab454_Array_Element_Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[];
		str =new String[3];
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);
		System.out.println("new value of String array");
		str[0]="raj";
		str[1]="amit";
		str[2]="kumar";
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);
	}

}
