import java.util.*;

public class oops10 {
      static int cube(int x){
            return x*x*x;
      }
      public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the number:");
            int n=sc.nextInt();
            int cal=oops10.cube(n);
            System.out.println("cube is :"+cal);
      }
      
}
