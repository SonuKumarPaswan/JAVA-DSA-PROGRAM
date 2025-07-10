package number_program;
import java.util.Scanner;
public class Rplace3With4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		System.out.println("The Rsultant Number is: "+replaceDigit(n));
	}
	public static int replaceDigit(int n)
	{
		if(n==3)
			return 4;
		else {
			int result=0;	int tenmul=1;
			while(n>0){
				int rem=n%10;
				if(rem==3)
					result=tenmul*4+result;
				else
					result=tenmul*rem+result;
				tenmul=10*tenmul;
				n=n/10;
			}
		return result;
		}
	}

}
