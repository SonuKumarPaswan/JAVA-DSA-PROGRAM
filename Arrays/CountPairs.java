public class CountPairs {
    public static void countPairs(int[] arr) {
        int tp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total time complexity : " + tp);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 11, 12 };
        countPairs(arr);
    }

}
// time complexity= 0(n);
// space complexity=0(1);