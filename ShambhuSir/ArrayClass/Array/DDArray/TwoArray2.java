import java.util.Scanner;

public class TwoArray2 {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row =");
        int rows = sc.nextInt();
        System.out.println("Enter no of column =");
        int cols = sc.nextInt();
        int[][] x = new int[rows][cols];
        System.out.println("Enter " + rows + "x" + cols + "=" + (rows * cols) + " integers :");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
