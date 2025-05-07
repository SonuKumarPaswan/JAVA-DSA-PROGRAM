import java.util.Arrays;

public class ContainsDuplicates {
    public static boolean containsDuplicates(int arr[]) {
        Arrays.sort(arr);
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(containsDuplicates(arr));
    }
}
