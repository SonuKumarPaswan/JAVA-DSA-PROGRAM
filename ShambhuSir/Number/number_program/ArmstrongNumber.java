package number_program;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();	
		if(isArmStrong(n))
			System.out.println(n+" is a ArmStrong Number");
		else
			System.out.println(n+" is not a ArmStrong Number");
	}
	public static boolean isArmStrong(int n)
	{
		int sum=0;		int a=n;
		int x=getDigitCount(n);
		while(n>0)
		{
			int rem=n%10;
			sum=sum+getPower(rem, x);
			n=n/10;
		}
		return a==sum;
	}
	public static int getDigitCount(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	public static int getPower(int a, int b)
	{
		int pow=1;
		for(int i=1;i<=b;i++)
		{
			pow=pow*a;
		}
		return pow;
	}

}





