package number_program;
import java.util.Scanner;
public class Permutation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n: ");
		int n=sc.nextInt();
		System.out.println("Enter r: ");
		int r=sc.nextInt();
		if(n>=r)
			System.out.println("Total ways to arrange are: "+getPermutaion(n,r));
		else
			System.out.println("permuation is not Possible!");
	}
	public static int getPermutaion(int n, int r)
	{
		int perm=1;
		for(int i=0;i<r;i++){
			perm=perm*(n-i);
		}
	return perm;
	}
}
