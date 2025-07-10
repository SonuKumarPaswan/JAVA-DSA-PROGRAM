package number_program;
import java.util.Scanner;
public class DissariumNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();	
		if(isDissarium(n))
			System.out.println("It is a Dissarium Number");
		else
			System.out.println("It is not a Dissarium Number");
	}
	public static boolean isDissarium(int n)
	{
		int count=getCount(n);
		int a=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+(int)Math.pow(rem, count);
			count--;
			n=n/10;
		}
	return sum==a;
	}
	public static int getCount(int n)
	{
		int count=0;
		while(n>0){
			count++;
			n=n/10;
		}
		return count;
	}


}
