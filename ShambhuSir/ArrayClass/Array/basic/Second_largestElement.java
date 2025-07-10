public class Second_largestElement {
    static void print2largest(int arr[], int n) {
        int second, first;
        if (n < 2) {
            System.out.printf("Invalid Input");
            return;
        }
        int largest = second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }
        System.out.println(largest);
        for (int i = 0; i < n; i++) {
            if (second != largest)
                first = Math.max(second, arr[i]);

        }
        if (second == Integer.MIN_VALUE) {
            System.out.printf("There is no second largest Element");
        } else
            System.out.printf("The Second larget" + "element is %d \n", first);

    }

    public static void main(String[] args) {
        int[] x = { 12, 34, 56, 86, 43, 24 };
        int length = x.length;
        print2largest(x, length);
    }

}
