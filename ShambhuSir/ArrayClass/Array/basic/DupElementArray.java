
public class DupElementArray {
    public static void main(String a[]) {
        int arr[] = {1,3,4,2,5,6,8,9,3,7};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Duplicate Element = " + (sum - 45));

    }
}
