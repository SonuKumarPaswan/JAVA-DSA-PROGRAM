
public class Sorting {

    public static void main(String[] args) {
        int arr[] = { 2, 3 - 7, 6, 8, -10, 15 };
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
