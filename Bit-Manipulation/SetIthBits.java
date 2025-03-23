public class SetIthBits {
    public static int setIthBits(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setIthBits(10, 2));
    }
}
