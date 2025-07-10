package number_program;

public class RandomNum {
	public static void main(String[] args) {
		System.out.println(Math.random());
		
		int x=(int)(Math.random()*10);
		System.out.println("The Number is: "+x);
		System.out.println("========================");
		int y=(int)(Math.random()*1000);
		System.out.println("The Number is: "+y);
	}

}
