package t20JavaCollectionsArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
Student s1=new Student(100, "Raj",24);
Student s2=new Student(101, "Amit",23);
Student s3=new Student(102, "Anuj",22);

ArrayList slist =new ArrayList();
slist.add(s1);
slist.add(s2);
slist.add(s3);
System.out.println("List of alll student object"+slist);
Iterator itr=slist.iterator();
while(itr.hasNext()) {
	Student st=(Student)itr.next();  
	
	System.out.println(st.rollNo+" "+st.name +" "+st.age);
}

	}

}
