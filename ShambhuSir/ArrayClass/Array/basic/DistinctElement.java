
import java.util.*;

public class DistinctElement {
    static void printDistinct(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j])
                    break;
            }
            if (i == j)
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 3, 8, 4, 123, 6, 4, 8 };
        int n = arr.length;
        Arrays.sort(arr);
        printDistinct(arr, n);
    }

}
