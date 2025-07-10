package string_program;

public class Program9 {
	public static void main(String[] args) {
		String s1="mohan";
		String s2=new String("mohan");
		s2=s2.intern();
		System.out.println(s1==s2);
	}

}
