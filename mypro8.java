
import java.util.*;

public class mypro8 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the salary :");
            float salary = sc.nextFloat();
            float tax = 0;
            if (salary < 2.5f) {
                  tax = tax + 0;
            } else if (salary > 2.5f && salary < 5.0f) {
                  tax = tax + 0.05f * (salary - 2.5f);
            } else if (salary > 5.0f && salary <= 10.0f) {
                  tax = tax + 0.05f * (5.0f - 2.5f);
                  tax = tax + 02 * (salary - 5.0f);
            } else if (salary > 10.0f) {
                  tax = tax + 0.05f * (5.0f - 2.5f);
                  tax = tax + 0.2f * (10.0f - 5.0f);
                  tax = tax + 0.3f * (salary - 10.0f);
            }
            System.out.println("toatl tax paid by user :" + tax);
            sc.close();
      }

}
