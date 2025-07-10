public class CountFrequency {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 2, 3, 3, 4, 5, 6, 7, 8, 7, 6, 5, 5, 4, 3, 2, 8 };
        countFrequencey(a);
    }

    public static void countFrequencey(int[] a) {

        int n = a.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = a[n - 1];
                    j--;
                    n--;
                }
            }
            System.out.println(a[i] + " is :" + count + "times");
        }
	System.out.println();
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
