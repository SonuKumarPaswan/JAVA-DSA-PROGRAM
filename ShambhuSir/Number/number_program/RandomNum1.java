package number_program;
import java.util.*;
public class RandomNum1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Lower Bound: ");
		int a=sc.nextInt();
		System.out.println("Enter the Upper Bound: ");
		int b=sc.nextInt();
		int randomnum=a+(int)(Math.random()*(b-a));
		System.out.println("Num is: "+randomnum);
	}

}
