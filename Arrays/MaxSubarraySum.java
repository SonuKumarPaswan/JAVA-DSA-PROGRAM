public class MaxSubarraySum {
    public static void maxSubarraySub(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += nums[k];
                }
                System.out.println("curr sum : " + currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int[] num = { 2, 4, 6, 8, 10 };
        maxSubarraySub(num);

    }

}
