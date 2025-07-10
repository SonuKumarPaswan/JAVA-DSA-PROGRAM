
public class DoubledimensionalArray {
    public static void main(String[] a) {
        int twoArray[][] = new int[4][5];
        int x = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                twoArray[i][j] = x;
                // x++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twoArray[i][j] + " "); 
            }
            System.out.println();
        }
    }

}
