package split_method_program;

public class PrintReverseWord {
	
	public static void main(String[] args) {
		String s1="mohan and sohan are here";
		System.out.println(s1);
		String[] p=s1.split(" ");
		for(int i=p.length-1;i>=0;i--)
			System.out.print(p[i]+" ");
	}

}
