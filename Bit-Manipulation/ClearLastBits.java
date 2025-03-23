public class ClearLastBits {
    public static int clearLastBits(int n, int i) {
        int bitMast = (~0) << i;
        return n & bitMast;
    }

    public static void main(String[] args) {
        System.out.println(clearLastBits(15, 2));

    }
}
