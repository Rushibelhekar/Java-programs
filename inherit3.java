
import java.util.*;

class ractangle{
      int length ;
      int bredth;

      ractangle(int x,int y)
      {
            length=x;
            bredth=y;
      }
      void areaofract()
      {
         int result=length*bredth;
         System.out.println("The area of ractangl :"+result);
      }
}
class sqare extends ractangle{
     int side;
      sqare(int x,int y,int z)
      {
       super(x,y);
       side=z;
      }
      void areaofsq()
      {
            int result2=side*side;
            System.out.println("The area of sqare :"+result2);
      }

}



public class inherit3 {
      public static void main(String[] args) {
            sqare ob1=new sqare(10, 20, 3);
            ob1.areaofract();
            ob1.areaofsq();
      }
      
}
