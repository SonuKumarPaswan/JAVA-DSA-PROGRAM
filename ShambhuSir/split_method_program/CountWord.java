package split_method_program;

public class CountWord {
	public static void main(String[] args) {
		String s1="mohan and  sohan   are here";
		int no_of_word=s1.split("\\s+").length;
		System.out.println("Total Words are: "+no_of_word);
	}

}
