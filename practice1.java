import java.util.*;

class largenum {
      public static int largenum1(int[] num, int total) {
            int temp;
            for (int i = 0; i < total; i++) {
                  for (int j = i + 1; j < total; j++) {
                        if (num[i] > num[j]) {
                              temp = num[i];
                              num[i] = num[j];
                              num[j] = temp;
                        }
                  }
            }
            return num[total-1];

      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("how many  numbers:");
            int num = sc.nextInt();
            int numbers[] = new int[100];
            System.out.println("enter the numbers:");
            for (int i = 0; i < num; i++) {
                  numbers[i] = sc.nextInt();
            }
            System.out.println("the numbers are:");
            for (int i = 0; i < num; i++) {
                  System.out.println("" + numbers[i]);
            }
            System.out.println("the lage num are:");
            {
                  System.out.println(""+largenum1(numbers, num));
            }
            sc.close();

      }

}
