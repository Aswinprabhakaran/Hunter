	package Hunter;
	import java.util.Scanner;
	public class H_65 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		int[] b=new int[size]; 
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the integer to be removed:");
		int d=sc.nextInt();
		for (int i = 0 ; i < size; i++) {
			if(a[i]!=d){
				b[i]=a[i];
			}
			}
		for (int i = 0; i < b.length; i++) {
			if(b[i]!=0)
			System.out.println(b[i]);
			}
			}
			}
