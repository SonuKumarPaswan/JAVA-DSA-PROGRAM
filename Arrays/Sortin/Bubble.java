public class Bubble {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int x = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    x++;
                }
            }
            if (x == 0) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 80, 30, 45, 60, 52, 20 };
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("\nAfter sorting :-- ");
        int arr1[] = bubbleSort(arr);
        for (int x : arr1) {
            System.out.print(x + " ");
        }
    }

}