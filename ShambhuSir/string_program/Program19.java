package string_program;

import java.util.Scanner;

public class Program19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1=sc.nextLine();
		getReverse(s1);
	}
	public static void getReverse(String s1)
	{
		String rev="";
		for(int i=0;i<s1.length();i++){
			rev=s1.charAt(i)+rev;
		}
		System.out.println("Reverse is: "+rev);
	}

}
