package number_program;
import java.util.Scanner;
public class HexadecimalToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Hexadecimal Number: ");
		String s1=sc.next();
		getDecimal(s1);
	}
	public static void getDecimal(String s1)
	{
		int dec=0;		int mul=1;
		for(int i=s1.length()-1;i>=0;i--)
		{
			char p=s1.charAt(i);
			if(p>='0' && p<='9')
				dec=dec+(p-48)*mul;
			else if(p>='A' && p<='F')
				dec=dec+(p-55)*mul;
			else if(p>='a' && p<='f')
				dec=dec+(p-87)*mul;
			else {
				System.out.println("This is Notb a valid Hexadecimal Number");
				return;
			}
			mul*=16;
		}
		System.out.println("The decimal value is: "+dec);
	}


}
