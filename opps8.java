

import java.util.*;

class emp_rec {
      int empid;
      String empna;
      int salary;

      public void getdata() {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the employee id:");
            empid = sc.nextInt();
            System.out.print("enter the employee name:");
            empna = sc.next();
            System.out.print("enter the employee salary:");
            salary = sc.nextInt();
      }

      public void printdata() {
            System.out.println("" + empid);
            System.out.println("\t" + empna);
            System.out.println("\t" + salary);
      }
}

class oops8 {
      public static void main(String[] args) {
            int more;
            do{
            Scanner sc = new Scanner(System.in);
            emp_rec empob[] = new emp_rec[50];
            System.out.println("how many number of data u want to store:");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  empob[i] = new emp_rec();
                  empob[i].getdata();
            }
            System.out.println("emp id\temp name\temp salary");
            for (int i = 0; i < n; i++) {
                  empob[i].printdata();
            }
            System.out.println("you want to store more(1/0):");
             more=sc.nextInt();
      }while(more==1);
}
}

