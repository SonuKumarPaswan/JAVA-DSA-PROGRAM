public class ReverseArray_method {
    
    public static void main(String a[]) {
        int  arr[] ={ 1, 2, 3, 4, 5 };
        reverseArray(arr);
    }
    

public static void reverseArray(int []x) {
    System.out.print("Reverse is Array  = ");
    for (int i = x.length-1; i>=0; i--) {
        System.out.print(" " + x[i]);
    }
}
}
