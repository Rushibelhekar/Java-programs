
class binary {

      int bns(int arr[], int a, int b, int x) {
            if (b >= a) {
                  int mid = a + (b - a) / 2;

                  if (arr[mid] == x)
                        return mid;

                  if (arr[mid] > x)
                        return bns(arr, b, mid - 1, x);

                  return bns(arr, mid + 1, b, x);
            }

            return -1;
      }

      public static void main(String args[]) {
            binary ob = new binary();
            int arr[] = { 1,8,9,3,7,22};
            int n = arr.length;
            int x = 9;
            int ans = ob.bns(arr, 0, n - 1, x);
            if (ans == -1)
                  System.out.println("Element not present");
            else
                  System.out.println("Element found at index "+ ans);
      }
}
