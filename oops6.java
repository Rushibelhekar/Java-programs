

import java.util.*;

import java.util.Scanner;

class myname {
      int id;
      String name;

      public void getname() {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter name:");
             name=sc.nextLine();
            
      }

      public void getid() {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter id:");
             id=sc.nextInt();
            
            
      }
      public void youdata(){
            System.out.println("your data is:");
            System.out.println("name\tid.no\n");
            System.out.println(""+name);
            System.out.println("\t"+id);
      }

      public void setname(String n) {
            name = n;
      }

      public void setid(int i) {
            id = i;
      }
      

}

public class oops6 {

      public static void main(String[] args) {
            myname s = new myname();
            // Scanner sc = new Scanner(System.in);
            // System.out.println("enter you name:");
            // s.name = sc.nextLine();
            // System.out.println("enter your id:");
            // s.id = sc.nextInt();
            System.out.println("your data is:");
            s.getname();
            s.getid();
            s.youdata();
      
            //s.setid(20);
            //s.setname("harsh");
           //System.out.println(s.getname());
            ///System.out.println(id);
;
      }
}
