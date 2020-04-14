package t17Reflection;


import java.lang.reflect.Method;

class B{
	private void msg() {
		System.out.println("hello B class private method");
	}
}

public class PrivateMethodCall {

	public static void main(String[] args)throws Exception{  
		  try {
	    Class c = Class.forName("B");  
	    Object o= c.newInstance();  
	    Method m =c.getDeclaredMethod("message", null);  
	    m.setAccessible(true);  
	    m.invoke(o, null);  
		  }catch(Exception e) {
			  System.out.println(e);
		  }
	} 
}
