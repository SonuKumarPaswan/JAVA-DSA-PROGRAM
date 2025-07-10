package number_program;
import java.util.Scanner;
import java.util.Random;
public class RandomNum3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Lower Bound: ");
	int a=sc.nextInt();
	System.out.println("Enter the Upper Bound: ");
	int b=sc.nextInt();
	Random r1=new Random();
	int randomnum=a+r1.nextInt(b-a);
	System.out.println("Num is: "+randomnum);
	
}

}
