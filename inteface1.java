class a{
      public void putdata(){
            System.out.println("this is parent class");
      }
}
class b extends a{
      public void printdata2()
      {
            System.out.println("this is childe class");
      }
}
public class inteface1 {
      public static void main(String[] args) {
             b obj =new b();
             obj.putdata();
             obj.printdata2();
      }
}
