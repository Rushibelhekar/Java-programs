
import java.util.*;
class staticv{
      String itemname;
      int itemprice;
      static String itemcode="ISI";
      public staticv(String itemname, int itemprice) {
            this.itemname = itemname;
            this.itemprice = itemprice;
      }
      public void printdata(){
            System.out.println(itemprice+""+itemname+""+itemcode);
      }
}
public class oops9 {

      public static void main(String[] args) 
            
       {
            staticv t1=new staticv("gghjbhj", 355);
            t1.printdata();

      }
      
}
