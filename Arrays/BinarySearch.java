public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int st = 0;
        int end = arr.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] > key)
                end = mid - 1;
            else
                st = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 11, 12 };
        int key = 11;
        System.out.println("Element is found : " + arr[binarySearch(arr, key)]);
    }

}