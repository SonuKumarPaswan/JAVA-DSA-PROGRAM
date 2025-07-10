package split_method_program;
public class Program16 {
	public static void main(String[] args) {
		String s1="peacdbefabcadef";
		String[] k=s1.split("[a|b]+");
		for(String p:k)
			System.out.println(p);
	}

}
