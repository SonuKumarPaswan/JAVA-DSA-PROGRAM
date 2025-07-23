public class SelectionSort {
    public static int[] selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 18, 10, 8, 5 };
        selectionSort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

}
