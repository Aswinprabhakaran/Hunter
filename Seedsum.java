package Hunter;
import java.util.Scanner;
public class Seedsum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check");
		int c=sc.nextInt();
		int d=c,g=c;
		System.out.println("enter the number");
		int f=sc.nextInt();
		while(c!=0)
		{
			d*=c%10;
			c/=10;
		}
		if(d==f){
			System.out.println(g +" is the seed of "+ f);
		}
		else{
			System.out.println("Not an seed");
		}
		}
		}
