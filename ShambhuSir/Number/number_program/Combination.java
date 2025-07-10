package number_program;

import java.util.Scanner;

public class Combination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter n: ");
		int n = sc.nextInt();
		System.out.println("Enter r: ");
		int r = sc.nextInt();
		if (n >= r)
			System.out.println("Total ways to select are: " + getCombination(n, r));
		else
			System.out.println("Selection is not Possible!");
	}

	public static int getCombination(int n, int r) {
		int comb = 1;
		for (int i = 0; i < r; i++) {
			comb = comb * (n - i) / (i + 1);
		}
		return comb;
	}

}
