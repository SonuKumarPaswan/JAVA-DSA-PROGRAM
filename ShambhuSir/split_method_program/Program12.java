package split_method_program;

public class Program12 {
	public static void main(String[] args) {
		String s1="abc7pa34cde88ace";
		String[] k=s1.split("\\d+");
		for(String p:k)
			System.out.println(p);
	}

}
