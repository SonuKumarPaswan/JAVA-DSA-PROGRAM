package split_method_program;
public class ReverseEachWord {
	public static void main(String[] args) {
		String s1="mohan and sohan are here";
		System.out.println(s1);
		String[] p=s1.split(" ");
		for(String k:p) {
			String word="";
			for(int i=0;i<k.length();i++)
				word=k.charAt(i)+word;
		System.out.print(word+" ");
		}
			
	}

}
