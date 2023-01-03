
import java.util.*;
public class mypro7 {
      public static void main(String[] args) {
            byte sub1,sub2,sub3;
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the marks of sub1:");
            sub1=sc.nextByte();
            System.out.println("enter the marks of sub2:");
            sub2=sc.nextByte();
            System.out.println("enter the mrks of sub3:");
            sub3=sc.nextByte();
            float avg= (sub1+sub2+sub3)/3.0f;
            System.out.println("your avg marks are :"+avg);
            if(avg>=40 && sub1>=33 && sub2>=33 && sub3>=33){
                  System.out.println("you are pass!!");
            }
            else{
                  System.out.println("you are fail!!!!");
            }
            sc.close();

      }
      
}
