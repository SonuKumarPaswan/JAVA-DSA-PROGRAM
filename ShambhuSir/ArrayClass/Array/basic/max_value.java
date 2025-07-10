public class max_value {
    public static void main(String[] x) {

        int[] arr = { 1, 2, 3, 45, 54 };
        int first;
        int second = 0;
        int largest = 54;
        first = Integer.MIN_VALUE;
        System.out.println(first);
        System.out.println(largest);
        // for (int i = 0; i < arr.length; i++) {
        // largest = Math.max(largest, arr[i]);
        // }
        for (int i = 0; i < arr.length; i++) {
            if (first != largest)
                second = Math.max(first, arr[i]);
        }
        System.out.println(second);
    }

}
