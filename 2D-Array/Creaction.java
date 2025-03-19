import java.util.Scanner;

public class Creaction {
    public static void main(String[] args) {
        int[][] martrix = new int[3][3];
        int n = martrix.length;
        int m = martrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                martrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(martrix[i][j] + "  ");
            }
            System.out.println();
        }

    }
}