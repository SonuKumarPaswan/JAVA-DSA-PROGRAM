public class Push_Zero2 {
    public static void main(String[] args) {
        int arr[] = { 0, 3, 1, 0, 2, 0, 5, 0 };
        int n = arr.length;
        int j = 0;
        int x[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                x[j++] = arr[i];
            else
                count++;
        }
        while (count > 0) {
            x[j] = 0;
            count--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
