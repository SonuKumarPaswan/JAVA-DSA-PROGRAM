public class PrintDes {
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static void printDes(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDes(n - 1);
    }

    public static void main(String[] args) {
        // printDes(10);
        printInc(10);
    }
}