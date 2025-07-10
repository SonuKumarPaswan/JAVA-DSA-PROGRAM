package split_method_program;
public class WordFrequency {
	public static void main(String[] args) {
		String s1="mohan is yes mohan yes mohan";
		getFrequencyOfWord(s1);
	}
	public static void getFrequencyOfWord(String s1) {
		String[] p=s1.split(" ");
		int n=p.length;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(p[i].equalsIgnoreCase(p[j])) {
					count++;
					p[j]=p[n-1];
					n--;	j--;
				}
			}
			System.out.println(p[i]+"==> "+count+" times");
		}
	}

}
