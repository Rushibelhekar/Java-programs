

import java.util.*;

public class addtwoarr {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of row:");
            int row = sc.nextInt();
            System.out.println("enter the number of columns:");
            int col = sc.nextInt();
            int array[][] = new int[row][col];
            int array2[][] = new int[row][col];
            int array3[][] = new int[row][col];
            System.out.println("enter the elements of array1:");
            for (int i = 0; i < row; i++) {
                  for (int j = 0; j < col; j++) {
                        array[i][j] = sc.nextInt();
                  }
            }
            System.out.println("enter the elements of array no 2:");
            for (int i = 0; i < row; i++) {
                  for (int j = 0; j < col; j++) {
                        array2[i][j] = sc.nextInt();
                  }
            }
            for (int i = 0; i < row; i++) {
                  for (int j = 0; j < col; j++) {
                        array3[i][j] = array[i][j] + array2[i][j];
                  }
            }
            System.out.println("the array elements are1:");
            for (int i = 0; i < row; i++) {
                  for (int j = 0; j < col; j++) {
                        System.out.print(array[i][j] + "\t");
                  }
                  System.out.println("\n");
            }
            System.out.println("the array no 2 is: ");
            for (int i = 0; i < row; i++) {
                  for (int j = 0; j < col; j++) {
                        System.out.print(array2[i][j] + "\t");
                  }
                  System.out.println("\n");
            }
            System.out.println("the addition of two array are:");
            for (int i = 0; i < row; i++) {
                  for (int j = 0; j < col; j++) {
                        System.out.print(array3[i][j] + "\t");
                  }
                  System.out.print("\n");
            }
      }
}
