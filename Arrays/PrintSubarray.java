public class PrintSubarray {
    public static void printSubArray(int[] arr) {
        int ts = 0;
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                if (sum > max)
                    max = sum;
                if (sum < min)
                    min = sum;
                ts++;
                System.out.print("------>" + sum + "\n");
            }
            System.out.println();
        }
        System.out.println("Max sum : " + max + "\nMin sum : " + min);
        System.out.println("Total sub Array : " + ts);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, -8, 10, 11, 12 };
        printSubArray(arr);
    }
}
