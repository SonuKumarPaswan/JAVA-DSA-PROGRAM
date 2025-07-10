
public class passby_method {

    public static void printArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(" " + x[i]);
        }
    }

    public static void main(String a[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        printArray(arr);
        System.out.println();
        printArray(new int[]{1,2,3,4,5,6}); // pass by value another method 
    }

}
