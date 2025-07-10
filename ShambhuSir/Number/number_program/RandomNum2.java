package number_program;
import java.util.Random;
public class RandomNum2 {
	public static void main(String[] args) {
		Random r1=new Random();
		int x=r1.nextInt();
		
		int y=r1.nextInt(1000);
		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
	}

}
