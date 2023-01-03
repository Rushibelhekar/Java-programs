public class linears{    
      public static int ls(int[] arr, int key){    
              for(int i=0;i<arr.length;i++){    
                  if(arr[i] == key){    
                      return i;    
                  }    
              }    
              return -1;    
          }    
          public static void main(String a[]){    
              int[] arr= {21,88,65,98,45,25,50};    
              int element = 98;    
              System.out.println(element+" is found at index: "+ls(arr, element));    
          }    
      }    