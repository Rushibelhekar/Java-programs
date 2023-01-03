

import java.util.*;

public class mypro10 {
      public static void main(String[] args) {
            int input;
            Scanner sc = new Scanner(System.in);
            do {

                  System.out.println("enter the website:");
                  String web = sc.next();
                  if (web.endsWith(".org")) {
                        System.out.println("this is organization website");
                  } else if (web.endsWith(".com")) {
                        System.out.println("this is comertial web");
                  } else if (web.endsWith(".in")) {
                        System.out.println("this is indian web");
                  }
                  System.out.println("do you want more checking(1/0):");
                  input = sc.nextInt();

            } while (input == 1);

      }
}