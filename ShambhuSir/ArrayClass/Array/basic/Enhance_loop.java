import java.util.Scanner;
public class Enhance_loop {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int list[], sum = 0;
        list = new int[6];
        System.out.println("Enter the Numbers");
        for (int t : list) {
            t = sc.nextInt();
            sum += t;
        }
        System.out.println("Sum of Prime numbers =" + sum);

    }

}
