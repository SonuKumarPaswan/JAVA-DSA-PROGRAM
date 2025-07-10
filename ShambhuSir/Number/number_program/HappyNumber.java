package number_program;
import java.util.Scanner;
public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();	
		if(isHappy(n))
			System.out.println(n+" is a Happy Number");
		else
			System.out.println(n+" is NOT a Happy Number");
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
