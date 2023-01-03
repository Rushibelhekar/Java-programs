

class employee{
      public int id;
      public String name;

      public void getdetails(){
            System.out.println("the id is :"+id);
            System.out.println("the name is:"+name);
      }
}
public class oops1 {
      public static void main(String[] args) {
            System.out.println("the custome class is:");
            employee rushi=new employee();

            rushi.id=12;
            rushi.name="rushikesh";

            rushi.getdetails();
            
      }
      
}
