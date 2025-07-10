package split_method_program;

public class Program15 {
	public static void main(String[] args) {
		String s1="abcaabdcfeabdvcse";
		String[] k=s1.split("[^bda]+");
		for(String p:k)
			System.out.println(p);
	}

}
