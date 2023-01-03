import java.io.*;
public class file2
{
	public static void main(String[] args) {
		
	try {
	     FileWriter obj=new FileWriter("firstname.txt");
	     obj.write("Vijay Dinanath Chauhan has an appoinment with Death");
	     obj.close();
	     System.out.println("Successfully written to file");
	    }
	 catch(Exception e) {
	    System.out.println(e);
	    e.printStackTrace();
	}	
	}
}

