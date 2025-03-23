public class EvenOdd {
    public static void evenOdd(int n) {
        int bitMsk = 1;
        if ((n & bitMsk) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        evenOdd(3);
        evenOdd(10);
        evenOdd(12);
    }
}
