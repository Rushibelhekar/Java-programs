import java.io.*;
public class file1
{
	public static void main(String[] args) {
		
	try {
	    File obj=new File("secondname.txt");
	    if(obj.createNewFile()){
	        System.out.println("File Created:"+obj.getName());
	        
	    } else {
	        System.out.println("File already exists");
	    }
	} catch(Exception e) {
	    System.out.println(e);
	    e.printStackTrace();
	}	
	}
}

