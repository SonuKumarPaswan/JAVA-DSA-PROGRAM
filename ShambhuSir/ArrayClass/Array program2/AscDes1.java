import java.util.Scanner;
class AscDes1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter length: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++){
			System.out.print("ENter element "+(i+1)+": ");
			a[i]=sc.nextInt();
		}
		sort(a);
		for(int i=0;i<a.length/2;i++)
			System.out.print(a[i]+" ");
		for(int i=a.length-1;i>=a.length/2;i--)
			System.out.print(a[i]+" ");
	} 
	public static int[] sort(int[] a)
	{
		int n=a.length;
		for(int i=0;i<n-1;i++){
			int x=0;
			for(int j=0;j<n-1-i;j++){
				if(a[j]>a[j+1]){
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
					x=1;
				}
			}
			if(x==0)
				break;
		}
	return a;	
	}				
}












