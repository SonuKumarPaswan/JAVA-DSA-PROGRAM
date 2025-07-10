import java.util.Scanner;

public class MouseInput_shortcut {
    public static void main(String[] a) {
        int x[][] = new int[3][];
        x[0] = new int[2];
        x[1] = new int[3];
        x[2] = new int[4];
        int i;
        Scanner sc = new Scanner(System.in);
        for (int t[] : x) {
            i = 0;
            System.out.println("Enter " + t.length + " Elements");
            for (int t1 : t) {
                t[i++] = sc.nextInt();
            }
        }
        for (int t[] : x) {
            for (int t1 : t) {
                System.out.print(" " + t1);
            }
            System.out.print("\n");
        }
    }
}
