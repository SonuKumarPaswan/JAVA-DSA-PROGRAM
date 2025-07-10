import java.util.Scanner;

public class extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        getBinary(n);
        System.out.println(120 % 10);

    }

    public static void getBinary(int n) {
        String bin = "";
        while (n > 0) {
            int rem = n % 8;
            bin = rem + bin;
            n = n / 8;
        }
        System.out.println(bin);
    }
}
