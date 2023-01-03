

import java.util.*;

/// 1.create a class cylinder and use getter and setters to set its radius and height 
class cylinder {
      int radius;
      int height;
      double pi = 3.14;

      cylinder(int height,int radius) {
            this.height = height;
            this.radius = radius;

      }

      public int getRadius() {
            return radius;
      }

      public void setRadius(int radius) {
            this.radius = radius;
      }

      public int getHeight() {
            return height;
      }

      public void setHeight(int height) {
            this.height = height;
      }

      public double surface() {

            return 2 * pi * radius * height + 2 * pi * radius * radius;
      }

      public double volume() {

            return pi * radius * radius * height;
      }

}

public class oops5 {
      public static void main(String[] args) {
            cylinder s = new cylinder(0, 0);

            System.out.println("enter the hight of the cylinder:");
            Scanner sc = new Scanner(System.in);
            s.height = sc.nextInt();
            System.out.println("enter the radius of cylinde:");
            s.radius = sc.nextInt();
            System.out.println("your data is:");
            System.out.println("surface:" + s.surface());
            System.out.println("volume:" + s.volume());

      }

}
