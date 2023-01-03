import java.util.*;
public class arr {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number of rows & col:");
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] myarr=new int[n][m];
            for(int i=0;i<n;i++){
                  for(int j=0;j<n;j++){
                  myarr[i][j]=sc.nextInt();
            }
      }
            for(int i=0;i<n;i++)
            {
                  for(int j=0;j<m;j++){
                  System.out.println("array is "+myarr[i][j]);
            }
      }
      System.out.println("enter the number to be search:");
      int num=sc.nextInt();
      for(int i=0;i<n;i++)
      {
            for(int j=0;j<m;j++)
            {
                  if(myarr[i][j]==num)
                  {
                        System.out.println("element Found at "+i+j);
                  }
                  
            }
      }
      
}
}
