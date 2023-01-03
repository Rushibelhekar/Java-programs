

class employee {
      int id;
      String name;
      String dname;
      int salary;
      static int cnt = 0;

      employee(int id, String name, String dname, int salary) {
            this.id = id;
            this.name = name;
            this.dname = dname;
            this.salary = salary;
            cnt++;
      }

      public void display() {
            System.out.println("id=" + id + "name=" + name + "department name=" + dname + "salary=" + salary);
      }

      public static void displaycnt() {
            System.out.println("object no is :" + cnt);
      }

}

class practical1 {
      public static void main(String[] args) {

            employee e = new employee(1, "akash", "msc", 2000);
            e.display();
            e.displaycnt();

      }
}