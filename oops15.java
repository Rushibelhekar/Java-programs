

import java.util.*;

class big {
      int playid;
      String playname;
      int playruns;

      // default constructor
      big() {
            playid = 1;
            playname = "rohit";
            playruns = 20000;
      }

      public big(int playid, String playname, int playruns) {
            this.playid = playid;
            this.playname = playname;
            this.playruns = playruns;
      }

      public void getdata() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the player id:");
            playid = sc.nextInt();
            System.out.println("enter the player name:");
            playname = sc.next();
            System.out.println("enter the player runs:");
            playruns = sc.nextInt();
      }

      public void putdata() {
            System.out.print(playid);
            System.out.print("\t" + playname);
            System.out.print("\t" + playruns);
            System.out.println();
      }


}

public class oops15 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("default player info:");
            big ob = new big();
            ob.putdata();
            System.out.println("how many player u want to store:");
            int n = sc.nextInt();
            big ds[] = new big[50];
            for (int i = 0; i < n; i++) {
                  ds[i] = new big();
            }
            System.out.println("enter your information:");
            for (int i = 0; i < n; i++) {
                  ds[i].getdata();
            }
            System.out.println("****player info****");
            System.out.println("player id\tplayer name\tplayer runs");
            for (int i = 0; i < n; i++) {
                  ds[i].putdata();
            }

      }

}
