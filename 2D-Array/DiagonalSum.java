
public class DiagonalSum {
    public static int diagonalSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] martrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        System.out.println(diagonalSum(martrix));
    }
}
