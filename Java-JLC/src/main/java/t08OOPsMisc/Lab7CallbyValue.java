package t08OOPsMisc;

public class Lab7CallbyValue {
	int data =50;
	void change(Lab7CallbyValue obj) {
		obj.data=obj.data+100;
	}

	public static void main(String[] args) {
		
		Lab7CallbyValue obj=new Lab7CallbyValue();
		
		System.out.println("before change "+obj.data);  
		   obj.change(obj);//passing object  
		   System.out.println("after change "+obj.data);  
	}
}
