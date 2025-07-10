package split_method_program;

public class Program17 {
	public static void main(String[] args) {
		String s1="abcefghijklmnodpqrstuvwxyz";
		String[] k=s1.split("[cd]");
		System.out.println(k.length);
		for(String p:k)
			System.out.println(p);
	}

}
