package string_program;
public class Program23 {
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder();
		System.out.println("s1 is: "+s1);
		System.out.println("Length is: "+s1.length());
		System.out.println("Capacity is: "+s1.capacity());
		s1.append("mohan");
		System.out.println("===============================");
		System.out.println("s1 is: "+s1);
		System.out.println("Length is: "+s1.length());
		System.out.println("Capacity is: "+s1.capacity());
		s1.append(" sohan are a good friends");
		System.out.println("===============================");
		System.out.println("s1 is: "+s1);
		System.out.println("Length is: "+s1.length());
		System.out.println("Capacity is: "+s1.capacity());
	}

}
