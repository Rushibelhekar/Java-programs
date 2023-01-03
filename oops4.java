

import java.util.*;

class emp2 {
      int id;
      String name;

      public int getid() {
            return id;
      }

      public String getname() {
            return name;
      }

      public class oops4 {
            public static void main(String[] args) {
                  emp2 rushi = new emp2();
                  Scanner sc = new Scanner(System.in);
                  System.out.println("enter id:");
                  rushi.id = sc.nextInt();
                  System.out.println("enter your name:");
                  rushi.name = sc.nextLine();
                  rushi.getid();
                  rushi.getname();
                  System.out.println("your data is: ");
                  System.out.println(rushi.getid());
                  System.out.println(rushi.getname());
            }

      }
}
