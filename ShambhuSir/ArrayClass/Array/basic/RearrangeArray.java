import java.io.*;
import java.util.*;

public class RearrangeArray {
    static void assign(int arr[], int n) {
        Arrays.sort(arr);
        int p = 0;
        int q = n - 1;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 0) {
                ans[i] = arr[q--];
            } else
                ans[i] = arr[p++];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String args[]) {
        int a[] = { 2, 4, 6, 2, 7, 5 };
        int n = a.length;
        assign(a, n);
    }
}
