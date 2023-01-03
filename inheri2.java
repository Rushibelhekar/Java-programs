
class printp{
      void printparent()
      {
            System.out.println("this is parent class");
      }
}
class printch extends printp{
      void printchaild()
      {
            System.out.println("this is chaild");
      }
}




public class inheri2 {
      public static void main(String[] args) {
            printp ob1=new printp();
            printch ob2=new printch();
            ob1.printparent();
            ob2.printchaild();
      }
      
}
