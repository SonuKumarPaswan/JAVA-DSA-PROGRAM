public class PrintSubarray2 {
    public static void printSubarray(int nums[]) {
        int totalSubarray = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k] + " ");
                }
                totalSubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray are : " + totalSubarray);
    }

    public static void main(String[] args) {
        int[] num = { 2, 4, 6, 8, 10 };

        printSubarray(num);
    }
}
