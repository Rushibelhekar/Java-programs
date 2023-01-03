

import java.util.*;



public class allbookcode1 {
      private static final int Year = 0;

      public static void main(String args[]) {
            // program to display massage
            // 1.-> System.out.println("my name");

            // program to print string
            /*->2.String st="rushi";
            System.out.println(st);
            */

            // program to constant integer number

            /*
             * int a=10;
             * int b=20;
             * System.out.println("a="+a);
             * System.out.println("b="+b);
             */
            // program to floate datatype

            // int a=10;
            // float f=a;
            // System.out.println(f);

            // program to addition of two num

            // int a=10;
            // int b=20;
            // float c=a+b;
            // System.out.println("addition is :"+c);

            // program to program to commandline argument

            // System.out.println("enter the data :"+args[0]);

            /// program to get the number from command line argument
            /*
             * int a=Integer.parseInt(args[1]);
             * int b=Integer.parseInt(args[0]);
             * System.out.println("a="+a);
             * System.out.println("b="+b);
             */
            // program to read the line
            /*
             * Scanner sc = new Scanner(System.in);
             * System.out.println("enter the line:");
             * String line = sc.nextLine();
             * System.out.println("the line is :" + line);
             */

            // program to nextint using scanner
            /*
             * Scanner sc = new Scanner(System.in);
             * System.out.println("enter the num:");
             * int num = sc.nextInt();
             * 
             * System.out.println("your num is :" + num);
             */

            // program to check leep year using scanner
            /*
             * Scanner sc = new Scanner(System.in) {
             * System.out.println("enter the year:");
             * int read=sc.nextInt();
             * }
             * if (((Year % 4 == 0) && (Year % 100 != 0) || (Year % 400 == 0))) {
             * System.out.println(Year+"this is leep year" );
             * } else {
             * System.out.println(Year+"this is not leep year" );
             * }
             */


             // program to calculate gretest number
             /* 
            Scanner sc = new Scanner(System.in);
            System.out.println("enter numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (a > b && a > c && a > d) {
                  System.out.println("a is gretest num" + a);
            } else if (b > a && b > c && b > d) {
                  System.out.println("b is gretest num :" + b);
            } else if (c > a && c > b && c > d) {
                  System.out.println("c is gretest num" + c);
            } else if (d > a && d > b && d > c) {
                  System.out.println("d is gretest num" + d);
            } else {
                  System.out.println("invalid");
            }
            */

            //program to calculate even numbers
/* 
            Scanner sc= new Scanner(System.in);
            int i=2;
            System.out.println("enter the limit:");
            int num =sc.nextInt();
            while(i<=num){
                  System.out.println(i);
                  i+=2;
            }
            */

            //program for pattern
/* 
            int num;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the num:");
            num=sc.nextInt();
            for(int i=num;i>0 ;i--)
            {
                  for(int j=1;j<=i;j++)
                  {
                    System.out.print("*");
                  }
                  System.out.print("\n");
            }*/

            //program to abcd pattern

            int num;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your num");
            num=sc.nextInt();
            char ch='A';
            for(int i=1;i<=num;i++)
            {
                  for(int j=1;j<=i;j++)
                  {
                        System.out.print(""+ch);
                  }
                  ch++;
                  System.out.print("\n");
            }
      }

}
