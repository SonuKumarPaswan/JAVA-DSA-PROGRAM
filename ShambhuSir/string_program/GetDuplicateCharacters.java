package string_program;

import java.util.Scanner;

public class GetDuplicateCharacters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1=sc.nextLine();
		getDuplicateCharacters(s1);
	}
	public static void getDuplicateCharacters(String s1)
	{
		int count=0;
		int[] p=new int[256];
		for(int i=0;i<s1.length();i++)
			p[s1.charAt(i)]++;
		for(int i=0;i<p.length;i++) {
			if(p[i]>1) {
				System.out.print((char)(i));
				count++;
			}
		}
		System.out.println("\nTotal Such characters are: "+count);
	}

}
