public class ReverseArr {
    public static int[] reverse(int[] arr) {
        // int first = 0, last = arr.length - 1;
        // while (first < last) {
        // int temp = arr[last];
        // arr[last] = arr[first];
        // arr[first] = temp;
        // first++;
        // last--; }
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 11, 12 };
        reverse(arr);
        for (int x : arr) {
            System.out.print(x + " ");

        }
    }
}
