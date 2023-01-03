import java.util.Scanner;

public class fibonic {
      public static void main(String[] args) {
            int a = 0, b = 1, c;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the limt:");
            int n=sc.nextInt();
            System.out.print(a + " " + b);

            for (int i=2;i<n;++i)
            {
                  c = a + b;
                  System.out.print(" " + c);
                  a = b;
                  b = c;
            }

      }
}
