package number_program;

import java.util.Scanner;
public class HappyInRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range: ");
		int n=sc.nextInt();	
		int ha_count=0;
		System.out.println("All Happy Numbers upto "+n+" are Below");
		for(int i=1;i<=n;i++)
		{
			if(isHappy(i)) {
				System.out.println(i);
				ha_count++;
			}	
		}
		System.out.println("Total are: "+ha_count);
	}
	public static boolean isHappy(int n)
	{
		while(n>9)
		{
			int sum=0;
				while(n>0) {
					int rem=n%10;
					sum=sum+rem*rem;
					n=n/10;
				}
				n=sum;
		}
	return n==1 || n==7;
	}

}
