

import java.util.Scanner;

class Emp {

      int side;
      int lengh;
      int width;
      double pi;
      int r;
      int salary;
      String name;

      public int area() {
            return side * side;
      }

      public int parameter() {
            return 4 * side;
      }

      public void hit() {
            System.out.println("hitting...");
      }

      public void run() {
            System.out.println("running...");
      }

      public void fire() {
            System.out.println("firening...");
      }

      public int area1() {
            return lengh * width;

      }

      public int parameter1() {
            return 2 * lengh * width;
      }

      public double area2() {
            return pi * r * r;
      }

      public double parameter2() {
            return 2 * pi * r;
      }
      public String getname(){
            return name;
      }
      public int  getsalary(){
            return salary;
      }
      
}

public class oops2 {

      public static void main(String[] args) {

            Emp rushi = new Emp();

            Scanner sc = new Scanner(System.in);
            // System.out.println("enter the lenth of sqare:");

            // rushi.lengh = sc.nextInt();
            // System.out.println("enter the width :");
            // rushi.width=sc.nextInt();
            // rushi.area1();
            // rushi.parameter1();
            // System.out.println(rushi.area1());
            // System.out.println(rushi.parameter1());
            // System.out.println("enter the redius:");
            // rushi.r = sc.nextInt();
            // rushi.pi = 3.14;
            // rushi.area2();
            // rushi.parameter2();
            // System.out.println(rushi.area2());
            // System.out.println(rushi.parameter2());
            System.out.println("enter the name:");
            rushi.name=sc.nextLine();
            System.out.println("enter the salary:");
            rushi.salary=sc.nextInt();
            rushi.getname();
            rushi.getsalary();
            System.out.println("your data is:");
            System.out.println("name="+rushi.getname());
            System.out.println("salary="+rushi.getsalary());

      }

}
