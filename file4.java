import java.io.*;
import java.util.*;
public class file4
{
	public static void main(String[] args) {
		String str=null;
	try {
	    File obj=new File("firstname.txt");
	    if(obj.delete()){
	        System.out.println("File Deleted");
	    } else {
	        System.out.println("Failed to delete the file");
	    }
	}
	 catch(Exception e) {
	    System.out.println(e);
	    e.printStackTrace();
	}	
	}
}
