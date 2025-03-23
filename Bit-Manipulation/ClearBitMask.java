public class ClearBitMask {
    public static int clearithBits(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearithBits(10, 1));
    }
}
