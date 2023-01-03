import java.io.*;
import java.util.*;
public class file3
{
	public static void main(String[] args) {
		String str=null;
	try {
	     File obj=new File("firstname.txt");
	     Scanner reader= new Scanner(obj);
	     while(reader.hasNextLine()) {
	          str=reader.nextLine();
	        System.out.println(str);
	     }
	     // System.out.println(str);
	     reader.close();
	    }
	 catch(Exception e) {
	    System.out.println(e);
	    e.printStackTrace();
	}	
	}
}
