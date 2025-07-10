package string_program;

import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1=sc.nextLine();
		getWordCount(s1);
	}
	public static void getWordCount(String s1)
	{
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(i==0 && s1.charAt(i)!=' ' || s1.charAt(i-1)==' ' && s1.charAt(i)!=' ')
				count++;
		}
		System.out.println("Total WOrd count is: "+count);
	}
	

}







