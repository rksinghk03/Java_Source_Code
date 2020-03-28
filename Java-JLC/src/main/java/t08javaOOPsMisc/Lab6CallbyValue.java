package t08javaOOPsMisc;
//
//In case of call by value original value is not changed. Let's take a simple example:
public class Lab6CallbyValue {
	int data=50;
	void change(int data) {
		data=100+data;
		System.out.println(data);
	}

	public static void main(String[] args) {
		Lab6CallbyValue  obj=new Lab6CallbyValue();
		 System.out.println("before change "+obj.data); 
		obj.change(100);
		 System.out.println("after change "+obj.data); 

	}

}
