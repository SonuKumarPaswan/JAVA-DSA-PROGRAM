package split_method_program;

public class Program4 {
	public static void main(String[] args) {
		String s1="cdaaapbak";
		String[] k=s1.split("a");
		System.out.println("Length is: "+k.length);
		for(int i=0;i<k.length;i++)
			System.out.println(k[i]);
	}

}
