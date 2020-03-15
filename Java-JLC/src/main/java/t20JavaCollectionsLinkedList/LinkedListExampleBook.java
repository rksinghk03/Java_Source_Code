package t20JavaCollectionsLinkedList;

import java.util.LinkedList;
import java.util.List;

class Book{
	int id;
	String name,author,publisher;
	public Book(int id, String name, String author,String publisher) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		
	}
}
public class LinkedListExampleBook {

	public static void main(String[] args) {
		List<Book> ll=new LinkedList<Book>(); 
		Book b1=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill"); 
	    Book b2=new Book(102,"Data Networking","Forouzan","Mc Graw Hill");  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley");  
		
		 //Adding Books to list  
	    ll.add(b1);  
	    ll.add(b2);  
	    ll.add(b3);  
	    
	    //Traversing list  
	    for(Book b:ll){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher);  
	    }  
	}

}
