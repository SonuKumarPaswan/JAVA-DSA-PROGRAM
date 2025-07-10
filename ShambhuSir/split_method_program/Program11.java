package split_method_program;

public class Program11 {
	public static void main(String[] args) {
		String s1="abc34Dab7cde44atb30avaccc";
		String[] k=s1.split("[a-zA-Z]+");
		for(String p:k)
			System.out.println(p);
	}

}
