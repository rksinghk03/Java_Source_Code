package t14InputOutput;

import java.io.File;

public class Lab_41_DirFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=new File("C:\\raj");
		File files []=dir.listFiles();
		  for(File file:files){  
		        System.out.println(file.getName()+" Can Write: "+file.canWrite()+" Is Hidden: "+file.isHidden()+" Length: "+file.length()+" bytes");  
		    }

	}

}
