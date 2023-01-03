import java.util.*;
public class iteretor {

      public static void main(String[] args) {
            ArrayList<String> per=new ArrayList<>();
            per.add("vijay");
            per.add("dinanath");
            per.add("chuhan");

            Iterator<String> it=per.iterator();
            while(it.hasNext())
            {
                  System.out.println(it.next());
            }
           per.remove("vijay");
           Iterator<String>itr=per.iterator();
           while(itr.hasNext())
           {
            System.out.println(itr.next());
            System.out.println("vijay removed");
           }
      }
      
}
