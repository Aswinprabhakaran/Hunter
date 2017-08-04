	package Hunter;
	import java.util.Scanner;
	public class Emailvalidation_69 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.next();
		int l=str.length();
		int count=0;
		for (int i = 0; i < l; i++) {
			if(str.charAt(i)=='@'||str.charAt(i)=='.'){
				count++;
			}}
		if(count==2){
		if(str.endsWith(".com")){
			int c=str.indexOf("@");
			int f=str.indexOf(".");
			if(c>=3)
				{
				String s1=str.substring(c+1,f);
				int l1=s1.length();
				if(l1>=5){
				System.out.println("valid Email ID");	
				}else
					System.out.println("Invalid Email Id");
				}else
					System.out.println("Invalid Email Id");
				}else
					System.out.println("Invalid Email Id");
				}else
					System.out.println("Invalid Email Id");
				}
				}