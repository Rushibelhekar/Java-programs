
import java.util.*;
public class mypro9 {
      public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter num :");
             int num=sc.nextInt();
             switch(num){
                  case 1->System.out.println("monday");
                  case 2->System.out.println("tusday");
                  case 3->System.out.println("wednesday");
                  case 4->System.out.println("thursday");
                  case 5->System.out.println("friday");
                  case 6->System.out.println("saturday");
                  case 7->System.out.println("sunday");
             }
            sc.close();
      }
      
}
