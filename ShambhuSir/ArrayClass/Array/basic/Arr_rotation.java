public class Arr_rotation {
    static void leftRtation(int arr[], int n, int k) {
        int mod = k % n;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[(i + mod) % n] + " ");

        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 7, 8 };
        int n = arr.length;
        int k = 3;
        leftRtation(arr, n, k);
        k = 4;
        leftRtation(arr, n, k);
        k = 15;
        leftRtation(arr, n, k);

    }

}
