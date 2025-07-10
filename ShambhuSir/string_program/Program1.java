package string_program;

public class Program1 {
	public static void main(String[] args) {
		String s1 = "mohan" + '\0';

		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(5));
		System.out.println((int) s1.charAt(5));
	}

}
