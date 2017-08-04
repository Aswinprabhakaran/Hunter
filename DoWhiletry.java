	package Hunter;
	import java.util.ArrayList;
	import java.util.Scanner;
	public class DoWhiletry {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> a2=new ArrayList<String>();
		String str;
		do{
			System.out.println("enter the detail:");
			a2.add(sc.next());
			System.out.println("Do u wish to continue , press Yes/No ");
			 str=sc.next();
		}while(str.equalsIgnoreCase("yes"));
	int max=0,f=0,d=0;
	String output = "";
	for (int i = 0; i < a2.size(); i++) {
		String dummy=a2.get(i);
		String[] summa=dummy.split("#");
		for (int j = 1; j < summa.length; j++) {
		max+=Integer.parseInt(summa[j]);
		}
		if(max>f){
			output=summa[0];
			f=max;
		}
		max=0;
	}
	System.out.println(" Maximum marks was obtained by "+output);
	}
	}