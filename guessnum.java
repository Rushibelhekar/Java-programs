
import java.util.*;

class game {
      int number;
      int guessnum;
      int num;

      game() {
            Random rand = new Random();
            this.number = rand.nextInt(100);
      }

      public void tacksuerinput() {
            System.out.println("enter the number:");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
      }

      public boolean iscorrectnum() {
            if (num == number) {
                  System.out.println("yess you win!!");
                  return true;
            } else if (num < number) {
                  System.out.println("number is too less!!");
            } else if (num > number) {
                  System.out.println("number is so high ");
            } else

                  return false;
            return false;

      }
}

public class guessnum {
      public static void main(String[] args) {
            game g = new game();
            boolean b = false;
            while (!b) {
                  g.tacksuerinput();
                  b = g.iscorrectnum();
            }
      }
}
