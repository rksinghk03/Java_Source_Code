package t15Networking;

import java.io.*;  
import java.net.*;  
public class Lab_02_MyClient {  
public static void main(String[] args) {  
		try{      
			Socket s=new Socket("localhost",6666);  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			dout.writeUTF("Hello Server raj kumar");  
			dout.flush();  
			dout.close();  
			s.close();  
		}catch(Exception e){
			System.out.println(e);
			}  
	}  
} 
// 1st My Server that MyClient to get output