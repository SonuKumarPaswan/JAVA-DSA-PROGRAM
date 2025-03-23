public class GetIthBits {
    public static int getIthBits(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int n = getIthBits(10, 3);
        System.out.println(n);
    }
}
