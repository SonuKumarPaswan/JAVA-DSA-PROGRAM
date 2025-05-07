public class MinMaxNo {
    public static void getMinMax(int arr[]) {
        int setMin = Integer.MAX_VALUE;
        int setMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < setMin)
                setMin = arr[i];
            if (arr[i] > setMax)
                setMax = arr[i];
        }
        System.out.println("Minimum value is :" + setMin);
        System.out.println("Maximum  value is :" + setMax);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int arr[] = { 100, 11, 44, 1, 33, 30 };
        getMinMax(arr);
    }
}
