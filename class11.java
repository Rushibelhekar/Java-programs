import java.util.*;

class class11 {
      int r;
      double pi = 3.14;

      public void getdata() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the radius of circle :");
             r = sc.nextInt();

      }

      public double area() {
            return pi * r * r;
      }
}

class class1 {
      public static void main(String[] args) {
            class11 obj = new class11();
            obj.getdata();
      System.out.println(obj.area());
            
      }

}
