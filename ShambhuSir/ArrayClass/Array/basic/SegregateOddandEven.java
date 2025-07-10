import java.io.*;

public class SegregateOddandEven {
   public static void arrayEvenAndOdd(int arr[], int n) {
      int a[];
      a = new int[n];
      int index = 0;
      for (int i = 0; i < n; i++) {
         if (arr[i] % 2 == 0) {
            a[index++] = arr[i];
         }
      }
      for (int i = 0; i < n; i++) {
         if (arr[i] % 2 != 0) {
            a[index++] = arr[i];
         }
      }
      for (int i = 0; i < n; i++) {
         System.out.print(a[i] + " ");
      }
      System.out.println(" ");

   }

   public static void main(String[] args) {
      int arr[] = { 1, 2, 4, 3, 5, 6, 8, 9, 11, 22 };
      int n = arr.length;
      arrayEvenAndOdd(arr, n);
   }
}