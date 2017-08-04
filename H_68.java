	package Hunter;
	import java.util.Scanner;
	public class H_68 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int c=0,index=0,f=0;
		for (int i = 0; i < a.length-1; i++) {
			int b=Math.abs(a[i]-a[i+1]);
			if(b>c){
				c=b;
				index=i;
				f=a[i];
			}
			}
		System.out.println(" max = "+c);
		System.out.println(" the element is :"+ f + " at the index = "+index);
			}
			}