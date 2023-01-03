

import java.util.*;

class member {

      String name;
      int age;
      String addrs;
      int sal;
      int phone;

      void getsal() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the salary :");
            sal = sc.nextInt();
      }

      void printsal() {
            System.out.println("the salary is :" + sal);
      }

}

class employee extends member {
      String spe;

      void getempdata() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the name :");
            name = sc.next();
            System.out.println("enter the addres :");
            addrs = sc.next();
            System.out.println("enter phon no:");
            phone = sc.nextInt();
            System.out.println("enter the specialzation :");
            spe = sc.next();
            System.out.println("enter the age :");
            age = sc.nextInt();
      }

      void printe() {
            System.out.println("name :" + name);
            System.out.println("address :" + addrs);
            System.out.println("phone :" + phone);
            System.out.println("specialization :" + spe);
            System.out.println("age :" + age);
            System.out.println("salary :" + sal);

      }

}

class manger extends member {
      String department;

      void getMdata() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the name :");
            name = sc.next();
            System.out.println("enter the addres :");
            addrs = sc.next();
            System.out.println("enter phon no:");
            phone = sc.nextInt();
            System.out.println("enter the department :");
            department = sc.next();
            System.out.println("enter the age :");
            age = sc.nextInt();
      }

      void printm() {
            System.out.println("===================================");
            System.out.println(name + "is manager :");
            System.out.println("name :" + name);
            System.out.println("address :" + addrs);
            System.out.println("phone :" + phone);
            System.out.println("Department :" + department);
            System.out.println("age :" + age);
            System.out.println("salry :" + sal);

      }

}

class inhex {

      public static void main(String[] args) {

            employee obj = new employee();
            obj.getsal();
            obj.getempdata();
            obj.printe();

      }
}
