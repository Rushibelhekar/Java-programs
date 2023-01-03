public class recursion {
      static String a = "rushi";

      public static String name1(int i) {
            if (i > 0) {

                  return a + name1(i - 1);

            } else {
                  return null;
            }
      }

      public static void main(String[] args) {
            String result = name1(10);
            System.out.println("\n" + result);

      }
}
