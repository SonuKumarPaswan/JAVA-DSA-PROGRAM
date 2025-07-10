package number_program;

import java.util.Scanner;

public class OctalToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Octal Number: ");
		int n=sc.nextInt();
		getDecimal(n);
	}
	public static void getDecimal(int n)
	{
		int sum=0;		int eightmul=1;
		while(n>0)
		{
			int rem=n%10;
			if(rem>=0 && rem<=7)
				sum=sum+rem*eightmul;
			else {
				System.out.println("This is Notb a valid Octal Number");
				return;
			}
			eightmul*=8;
			n=n/10;
		}
		System.out.println("The decimal value is: "+sum);
	}

}
