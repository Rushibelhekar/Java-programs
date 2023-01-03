
import java.util.*;
class playerinfo{
      int player_id;
      String player_name;
      int player_runs;

      ///default constructor

      playerinfo(){
            player_id=1;
            player_name="virat";
            player_runs=200000;
      }
      //parameterized constructor
      public playerinfo(int player_id, String player_name, int player_runs) {
            this.player_id = player_id;
            this.player_name = player_name;
            this.player_runs = player_runs;
      }

      public void putdata(){
            System.out.println(player_id);
            System.out.println(player_name);
            System.out.println(player_runs);
      }
}
public class opps14 {
      public static void main(String[] args) {
            System.out.println("default player information");
            playerinfo obj=new playerinfo();
            obj.putdata();
            System.out.println("parameterized player information:");
            playerinfo ob=new playerinfo(2, "dhoni", 20000);
            ob.putdata();
      }
}
