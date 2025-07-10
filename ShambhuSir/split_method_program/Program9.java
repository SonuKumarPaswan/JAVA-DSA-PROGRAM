package split_method_program;

public class Program9 {
	public static void main(String[] args) {
		String s1="a3bc4m7d";
		String[] k=s1.split("[a-z]+");
		for(String p:k)
			System.out.println(p);
	}

}
