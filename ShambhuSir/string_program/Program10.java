package string_program;

public class Program10 {
	public static void main(String[] args) {
		System.out.println('7'-48+'5'-48);
		
		String s1="a4bc38cab5";
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<=57)
				sum=sum+s1.charAt(i)-48;
		}
		System.out.println("SUm is: "+sum);
	}

}
