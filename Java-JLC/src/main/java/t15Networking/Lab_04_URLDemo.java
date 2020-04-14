package t15Networking;

import java.net.URL;

public class Lab_04_URLDemo {
	public static void main(String[] args){  
		try{  
		//URL url=new URL("http://www.javatpoint.com/java-tutorial"); 
		URL url =new URL("https://learning.oreilly.com/videos/spring-5-in/9781789139839/9781789139839-video2_1");
		  
		System.out.println("Protocol: "+url.getProtocol());  
		System.out.println("Host Name: "+url.getHost());  
		System.out.println("Port Number: "+url.getPort());  
		System.out.println("File Name: "+url.getFile());  
		  
		}catch(Exception e){
			System.out.println(e);
			}  
		}  

}
