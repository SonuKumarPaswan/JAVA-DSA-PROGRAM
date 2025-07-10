package number_program;

import java.util.Scanner;
public class PascalSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n: ");
		int n=sc.nextInt();
		getPascalSeries(n);
	}
	public static void getPascalSeries(int n)
	{
		for(int x=0;x<n;x++)
		{
			int comb=1;
			for(int i=0;i<x;i++)
			{
				comb=comb*(n-i-1)/(i+1);
			}
			System.out.print(comb+"  ");
		}
	}
}
