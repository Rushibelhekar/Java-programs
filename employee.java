
import java.util.*;

class emp_record {
      int emp_id;
      String emp_name;
      double emp_salary;

      public void getdata() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the employee id=");
            emp_id = sc.nextInt();
            System.out.println("enter the employee name=");
            emp_name = sc.next();
            System.out.println("enter the employee salary =");
            emp_salary = sc.nextDouble();
      }

      public void showdata() {
            System.out.print("\t" + emp_id);
            System.out.print("\t" + emp_name);
            System.out.print("\t\t" + emp_salary);
            System.out.println();
      }

}

class employee1 {
      public static void main(String[] args) {
            emp_record emp = new emp_record();
            emp_record emp_ob[] = new emp_record[50];
            Scanner sc = new Scanner(System.in);
            System.out.println("how many record you want to insert:");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  emp_ob[i] = new emp_record();
                  emp_ob[i].getdata();
            }
            System.out.println("****** employee information *******");
            System.out.println("employee id\temployee name\temployee salary\n");
            for (int i = 0; i < n; i++) {
                  emp_ob[i].showdata();
            }

      }
}