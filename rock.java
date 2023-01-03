

import java.util.*;

public class rock {
      public static void main(String[] args) {
            // 0 for rock
            // 1 for paper
            // 2 for seaser

            Scanner sc = new Scanner(System.in);
            System.out.println("enter 0 for rack,1 for paper, 2 for seaser:");
            int userinput = sc.nextInt();

            Random random = new Random();
            int computerchoice = random.nextInt(3);

            if (userinput == computerchoice) {
                  System.out.println("draw");
            } else if (userinput == 0 && computerchoice == 2 || userinput == 1 && computerchoice == 0
                        || userinput == 2 && computerchoice == 1) {
                  System.out.println("you win!!");
            } else {
                  System.out.println("computer win!!");
            }
            if (computerchoice == 0) {
                  System.out.println("computerchoice=rock");
            } else if (computerchoice == 1) {
                  System.out.println("computerchoice=paper");
            } else if (computerchoice == 2) {
                  System.out.println("computerchoice=seaser");
            }

      }

}
