public class CountSorting {
    public static int[] countSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        int count[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 2, 2, 4, 6, 7, 8, 3, 2 };
        countSort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

}
