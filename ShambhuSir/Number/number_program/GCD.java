package number_program;
import java.util.Scanner;
public class GCD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int b=sc.nextInt();
		int gcd=getGCD(a,b);
		int lcm=(a*b)/gcd;
		System.out.println("GCD of "+a+" and "+b+" is: "+gcd);
		System.out.println("LCM of "+a+" and "+b+" is: "+lcm);
	}
	public static int getGCD(int a, int b)
	{
		return b==0?a:getGCD(b, a%b);
	}
}
