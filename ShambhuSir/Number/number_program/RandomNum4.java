package number_program;
import java.util.Random;
import java.util.Scanner;
public class RandomNum4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Lower Bound: ");
		int a=sc.nextInt();
		System.out.println("Enter the Upper Bound: ");
		int b=sc.nextInt();
		Random r1=new Random();
		for(int i=1;i<=10;i++)
		{
			int randomnum=a+r1.nextInt(b-a);
			System.out.println("Random Number "+i+" is: "+randomnum);
		}
		
	}


}
