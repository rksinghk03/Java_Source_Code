package methodReferences;
interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
} 
public class Lab_08_ConstructorReference {
	public static void main(String[] args) {  
        Messageable hello = Message::new;  
        hello.getMessage("Hello how are you");  
    }

}
