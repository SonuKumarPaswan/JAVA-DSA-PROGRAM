package number_program;

import java.util.Scanner;
public class DecimalToBaseKNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal Number: ");
		int n=sc.nextInt();
		System.out.println("Enter the Base: ");
		int k=sc.nextInt();
		getResultValue(n, k);
	}
	public static void getResultValue(int n, int base)
	{
		String result="";	int a=n;
		while(n>0)
		{
			int rem=n%base;
			if(rem<=9)
				result=rem+result;
			else
				result=(char)(rem+87)+result;
		n=n/base;
		}
		System.out.println("The number "+a+" in base "+base+" is: "+result);
	}

}
