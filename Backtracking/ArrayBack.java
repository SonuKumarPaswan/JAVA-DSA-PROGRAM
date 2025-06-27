package Backtracking;

public class ArrayBack {
    public static void changeArr(int arr[], int i, int val) {
        if (i == arr.length) {
            display(arr);
            return;
        }

        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        display(arr);
        System.out.println();
        changeArr(arr, 0, 1);
        System.out.println();
        display(arr);
        // System.out.println("Hello");

    }
}
