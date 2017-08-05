	package Hunter;
	import java.util.Arrays;
	import java.util.Scanner;
	public class MinAbsolutePair_56 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int c=5,c1=-5;
			inner : for (int i = 0; i < size; i++) {
			for (int j =0; j < size; j++) {
				if(j!=i){
				sum=arr[i]+arr[j];
				if(sum<=c&&sum>=c1){
				System.out.println(arr[i]+" "+arr[j]);
				c=sum;
				break inner;
				}	
				}
				}
				}
				}
				}