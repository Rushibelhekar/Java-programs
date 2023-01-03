import java.util.*;
class student{
      int rollno1,roll2;
      String name1,name2;
      public void getdata(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the roll_no & name student1:");
            rollno1=sc.nextInt();
            name1=sc.next();
            System.out.println("enter the roll_no & name student:");
            roll2=sc.nextInt();
            name2=sc.next();
      }
} 
class attendence extends student{
      int presentday;
      float avg;
      public void getavg()
      {
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the student present days out of 180 :");
            presentday=sc.nextInt();
            avg=presentday/2;
      }
      public void printdata(){
            System.out.println("student1 roll_no and Name :"+rollno1+"\t"+name1);
            System.out.println("student2 roll_no and Name :"+roll2+"\t"+name2);
            System.out.println("student Average attendence is :"+avg);
      }


      public static void main(String[] args) {
            attendence a=new attendence();
            a.getdata();
            a.getavg();
            a.printdata();
      }
}
