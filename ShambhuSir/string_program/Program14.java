package string_program;

public class Program14 {
	public static void main(String[] args) {
		String s1="mohan is here and there";
		String s2=s1.substring(10);
		System.out.println("s2 is: "+s2);
		String s3=s1.substring(10, 15);
		System.out.println("s3 is: "+s3);
		String s4=s1.replace("er", "INDIA");
		System.out.println(s4);
	}

}
