package number_program;
import java.util.Scanner;
public class DissariumInRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range: ");
		int n=sc.nextInt();	
		int dis_count=0;
		for(int i=1;i<=n;i++)
		{
			if(isDissarium(i)){
				System.out.println(i);
				dis_count++;
			}
		}
		System.out.println("total Such Numbers are: "+dis_count);
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
