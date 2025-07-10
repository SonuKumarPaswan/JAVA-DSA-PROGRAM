import java.util.Scanner;

public class MouseInput {
    public static void main(String[] a) {
        int x[][] = new int[3][];
        x[0] = new int[3];
        x[1] = new int[2];
        x[2] = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Matrix");
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("Enter 3 Value of 0th row");
                for (int j = 0; j < 3; j++)
                    x[i][j] = sc.nextInt();

            } else if (i == 1) {
                System.out.println("Enter 2 Value of 1th row");
                for (int j = 0; j < 2; j++)
                    x[i][j] = sc.nextInt();

            } else if (i == 2) {
                System.out.println("Enter 4 Value of 2th row");
                for (int j = 0; j < 4; j++)
                    x[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                for (int j = 0; j < 3; j++)
                    System.out.print(x[i][j] + " ");
                System.out.print("\n");
            } else if (i == 1) {
                for (int j = 0; j < 2; j++)
                    System.out.print(x[i][j] + " ");

                System.out.print("\n");
            } else if (i == 2) {
                for (int j = 0; j < 4; j++)
                    System.out.print(x[i][j] + " ");

                System.out.print("\n");
            }
        }

    }
}
