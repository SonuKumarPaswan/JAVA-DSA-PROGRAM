//find the largest three distinct element in an array 
/* 
package Best_questionOfArray;
public class Print3Largest {
    static void print3largest(int arr[], int arr_size) {
        int first, second, third;
        if (arr_size < 3) {
            System.out.print("Invalid Input");
            return;
        }
        third = first = second = Integer.MIN_VALUE; 
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third)
                third = arr[i];
        }
        System.out.println("Three largest Element =" + first + " " + second + " " + third);
    }

    public static void main(String[] a) {
        int arr[] = { 12, 34, 56, 78, 98, 123 };
        int n = arr.length;
        print3largest(arr, n);
    }
}
*/

// Method -2 
    import java.io.*;
    import java.util.Arrays;
    public class Print3Largest{
    static  void print3largest(int arr[]){
            Arrays.sort(arr);
        System.out.println("Three largest Element = " +arr[arr.length-1] +" "+arr[arr.length-2]+" "+arr[arr.length-3]);
    }
    public static void main(String []a){
        Print3Largest sc = new Print3Largest();
        int arr[]= {2,34,65,74,47,344,87};
      Print3Largest.print3largest(arr);
    }
}
