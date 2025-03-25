public class CountFactorial {
    public static int printFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        // int fact = printFactorial(n - 1);
        // int fac = n * fact;
        int fac = n * printFactorial(n - 1);
        return fac;
    }

    public static void main(String[] args) {
        System.out.println(printFactorial(5));
    }
}
