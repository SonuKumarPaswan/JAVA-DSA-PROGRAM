public class ClearBitsInRange {
    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        int no = clearBitsInRange(15, 1, 2);
        System.out.println(no);
    }
}
