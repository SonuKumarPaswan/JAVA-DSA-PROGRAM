public class FirstOccurrence {
    public static int firstOccurrence(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurrence(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 34, 4, 5, 6, 7 };
        System.out.println(firstOccurrence(arr, 0, 5));
    }
}