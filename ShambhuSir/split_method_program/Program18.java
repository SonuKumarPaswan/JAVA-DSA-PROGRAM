package split_method_program;

public class Program18 {
	public static void main(String[] args) {
		String result="";
		String s1="mohan is here. sohan is there. they are happy.";
		String[] k=s1.split("[.]");
		for(String p:k)
			System.out.println(p);
	}

}
