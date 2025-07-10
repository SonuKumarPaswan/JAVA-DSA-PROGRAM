package split_method_program;
import java.util.*;
public class AddNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1=sc.nextLine();
		System.out.println("Sum of Numeric Digit is: "+getSum(s1));
		
	}
	public static int getSum(String s1) {
		String[] k=s1.split("[a-zA-Z]+");
		int sum=0;
		for(String p:k) {
			if(!p.isBlank())
				sum=sum+Integer.valueOf(p);
		}
	return sum;
	}
}








