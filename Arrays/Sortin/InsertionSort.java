public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 16, 12, 5, 10 };
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("\nAfter sorting");

        int[] arr1 = insertionSort(arr);
        for (int x : arr1) {
            System.out.print(x + " ");
        }

    }

}
