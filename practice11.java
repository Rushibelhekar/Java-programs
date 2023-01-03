 class student {
      String name;
      int roll;
      student(String name,int roll)
      {
            this.name=name;
            this.roll=roll;
            
      }
      public void printdata()
      {
          System.out.println("\n"+name+"\n"+roll);
      }
      
}
class practice11{
      public static void main(String[] args) {
            student obj=new student("vijay", 02);
            obj.printdata();
      }
}
