package Hunter;
import java.util.Scanner;
public class RermoveStringDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		char[] ch=str.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if(j!=i){
				if(ch[i]==ch[j]){
					ch[j]='\0';
					count++;
				}
				}
				}
			if(count>0){
				ch[i]='\0';
			}
			count=0;
			}
			for (int i = 0; i < ch.length; i++) {
			if(ch[i]!='\0'){
				System.out.print(ch[i]);
			}
			}
			}
			}
