package number_program;
import java.util.Scanner;
public class DecimalToHexadecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal Number: ");
		int n=sc.nextInt();
		getHexadecimal(n);
	}
	public static void getHexadecimal(int n)
	{
		String hex="";
		while(n>0)
		{
			int rem=n%16;
			if(rem<=9)
				hex=rem+hex;
			else
				hex=(char)(rem+87)+hex;
		n=n/16;
		}
		System.out.println("The Hexadecimal value is: "+hex);
	}
	

}
