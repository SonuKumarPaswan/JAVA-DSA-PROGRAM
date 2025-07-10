public class TwopointerTechnique2 {
    public static int isSumPair(int a[], int n, int x) {
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (a[i] + a[j] == x)
                return 1;
            else if (a[i] + a[j] < x)
                i++;
            else
                j--;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7, 8, 9 };
        int arrSize = arr.length;
        int val = 17;
        System.out.println(isSumPair(arr, arrSize, val));
    }

}
