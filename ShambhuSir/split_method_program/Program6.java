package split_method_program;

public class Program6 {
	public static void main(String[] args) {
		String s1="cdaaakbaacdatab";
		String[] k=s1.split("a+");
		System.out.println("Total size: "+k.length);
		for(String p:k)
			System.out.println(p);
	}

}
