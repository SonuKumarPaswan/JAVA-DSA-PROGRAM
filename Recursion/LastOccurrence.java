public class LastOccurrence {
    public static int lastOccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurrence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 3, 2, 5 };
        System.out.println(lastOccurrence(arr, 5, 0));
    }
}
