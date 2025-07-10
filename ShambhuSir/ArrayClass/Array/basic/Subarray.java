public class Subarray {
    void SubArraySum(int arr[], int n, int sum) {
        for (int i = 0; i < n; i++) {
            int CurrentSum = arr[i];
            if (CurrentSum == sum) {
                System.out.println("Sum found at index" + i);
                return;
            } else {
                for (int j = i + 1; j < n; j++) {
                    CurrentSum += arr[j];
                    if (CurrentSum == sum) {
                        System.out.println("Sum found between index " + i + " and " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("No Subarray found");
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 78, 9, 3, 5 };
        int n = arr.length;
        int sum = 83;
        Subarray arraysum = new Subarray();
        arraysum.SubArraySum(arr, n, sum);
    }

}
