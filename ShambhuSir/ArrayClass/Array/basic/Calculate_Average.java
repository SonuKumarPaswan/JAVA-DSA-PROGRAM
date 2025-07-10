import java.util.Scanner;
 class AverageArray {
     public static void main(String a[]){
        int arr[]= new int[10];
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 number");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Average Sum = " +((float)sum/arr.length));
     }
 }