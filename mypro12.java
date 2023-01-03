
import java.util.*;
public class mypro12 {
      public static void main(String[] args) {
            int input;
            do{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the num:");
            int num =sc.nextInt();
            for(int i=1;i<=10;i++)
            {
                  System.out.println(num*i);
            }
            System.out.println("do u want mare table(1/0):");
             input=sc.nextInt();
      }while(input==1);
      
}
}