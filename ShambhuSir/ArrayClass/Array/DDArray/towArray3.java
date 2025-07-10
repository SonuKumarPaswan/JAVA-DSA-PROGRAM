
public class towArray3 {
    public static void main(String[] a) {
        int two[][] = new int[4][];
        two[0] = new int[1];
        two[1] = new int[2];
        two[2] = new int[3];
        two[3] = new int[4];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++)
                two[i][j] = k;
            k++;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(two[i][j] + " ");
            }
            System.out.println();
        }

    }

}
