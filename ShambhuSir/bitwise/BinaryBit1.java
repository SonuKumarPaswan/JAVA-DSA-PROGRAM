import java.util.Scanner;
class BinaryBit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();

		while(n!=0)
		{
			System.out.print(n&1);

		n=n>>>1;
		}
		
	} 
}




