public class return_refrence {
    public static void main(String[] a) {
        int x[] = { 10, 9, 15, 6, 45 };
        int arr[] = reverse(x);
        System.out.println("\n Reverse Array is");
        for (int t : arr) {
            System.out.println(" " + t);
        }
    }

    public static int[] reverse(int[] list) {
        int result[] = new int[list.length];
        int j = list.length;
        for (int i = 0; j > 0; i++ , j--) {
            result[i] = list[i];
        }
        return result;
    }
}
