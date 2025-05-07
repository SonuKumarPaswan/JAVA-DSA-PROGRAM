import java.util.ArrayList;
import java.util.List;

public class MaxSumSubarray {
    public static void kadanesAlgorithm(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            list.add(arr[i]);
            if (currSum < 0) {
                list.clear();
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(list);
        System.out.println("Maximum sum is : " + maxSum);
    }

    public static void kadanesAlgo(int arr[]) {
        List<Integer> list = new ArrayList<>();
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            list.add(arr[i]);
            if (currSum < 0) {
                list.clear();
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(list);
        System.out.println("Maximum sum is : " + maxSum);

    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // kadanesAlgorithm(arr);
        kadanesAlgo(arr);
    }
}
