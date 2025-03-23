public class UpdateIthBits {
    public static int clearithBits(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setIthBits(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int updateIthBits(int n, int i, int newBits) {
        // if (newBits == 0) {
        // return clearithBits(n, i);
        // } else {
        // return setIthBits(n, i);
        // }
        n = clearithBits(n, i);
        int bitMask = newBits << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBits(10, 2, 1));
    }
}
