// program no 1 of chapter 3//
/* 
package myjava;

import java.util.*;

class a {
      int num1;

      public void getnum() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number1: ");
            num1 = sc.nextInt();
      }
}

class inheritance extends a {
      int num2;

      public void getnum2() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number2:");
            num2 = sc.nextInt();
      }

      public void display() {

            System.out.println("the number1 is:" + num1);
            System.out.println("the number2 is:" + num2);
      }

      public static void main(String[] args) {
            inheritance obj = new inheritance();
            obj.getnum();
            obj.getnum2();
            obj.display();
      }
}
 */
//program no 2//
/* 
package myjava;

import java.util.*;

class college {
      String cname;

      college(String cname) {
            this.cname = cname;
      }
}

class inheritance extends college {
      String dname;

      inheritance(String x1, String dname) {
            super(x1);
            this.dname=dname;
      }

      public void display() {
            System.out.println(super.cname + "and" + dname);
      }

      public static void main(String[] args) {
            inheritance obj = new inheritance("ahmednagar college", "computer science");
            obj.display();
      }
}
 */
// program nober 14 in chapter no 3;//


import java.util.*;

abstract class staff {
      String name;
      String address;
}

class fulltimestaff extends staff {
      String department;
      int salary;

      public void getdname() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the name of employee :");
            name = sc.next();
            System.out.println("enter the address of employee :");
            address = sc.next();
            System.out.println("enter the department name :");
            department = sc.next();
            System.out.println("enter the salary of employee :");
            salary = sc.nextInt();
      }

      public void displayfulltime() {
            System.out.println("the name of employee is:" + name);
            System.out.println("the address of employee is :" + address);
            System.out.println("department name is :" + department);
            System.out.println("salary of employee :" + salary);
            System.out.println("---------------------------------------");
      }
}

class parttimestaff extends staff {
      float numberofhours;
      int rateofperhour;

      public void getparttime() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the name of employee :");
            name = sc.next();
            System.out.println("enter the address of employee :");
            address = sc.next();
            System.out.println("enter the number of hours of eployee work :");
            numberofhours = sc.nextFloat();
            System.out.println("enter the rate of perhours :");
            rateofperhour = sc.nextInt();
      }

      public void displayparttime() {
            System.out.println("the name of employee is:" + name);
            System.out.println("the address of employee is :" + address);
            System.out.println("nomber of hours are :" + numberofhours);
            System.out.println("rate of per hours :" + rateofperhour);
            System.out.println("------------------------------------------------");
      }
}

class inheritance {

      public static void main(String[] args) {

            int i, ch, choice;

            Scanner sc = new Scanner(System.in);
            do {
                  System.out.println("select any one :");
                  System.out.println("1.full time staff");
                  System.out.println("2.part time staff");
                  ch = sc.nextInt();

                  switch (ch) {
                        case 1:
                              int n;
                              System.out.println("enter the number of full time staff :");
                              n = sc.nextInt();
                              fulltimestaff[] p = new fulltimestaff[n];
                              for (i = 0; i < n; i++) {
                                    p[i] = new fulltimestaff();
                                    p[i].getdname();
                              }
                              for (i = 0; i < n; i++) {
                                    p[i].displayfulltime();
                              }
                              break;
                        case 2:
                              int m;
                              System.out.println("enter the number parttime staff :");
                              m = sc.nextInt();
                              parttimestaff[] h = new parttimestaff[m];
                              for (i = 0; i < m; i++) {
                                    h[i] = new parttimestaff();
                                    h[i].getparttime();
                              }
                              for (i = 0; i < m; i++) {
                                    h[i].displayparttime();
                              }
                  }
                  System.out.println("you want more operations (1/0):");
                  choice = sc.nextInt();
            } while (choice == 1);
      }

}