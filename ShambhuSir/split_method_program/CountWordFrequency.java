package split_method_program;
import java.util.*;
public class CountWordFrequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the STring ");
		String s1=sc.nextLine();
		System.out.println("ENter target String ");
		String target=sc.nextLine();
		getCount(s1, target);
	}
	public static void getCount(String s1, String target) {
		int count=0;
		String[] k=s1.split("\\s+");
		for(int i=0;i<k.length;i++) {
			if(k[i].equals(target))
				count++;
		}
		System.out.println(target+" is: "+count+" times");
	}

}
