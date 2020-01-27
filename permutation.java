import java.util.*;
public class permutation {
	static Scanner sc=new Scanner(System.in);
	static void permute(String str,int l,int r) {
		if(l==r)
			System.out.print(str+" ");
		else {
			for(int i=l;i<=r;i++) {
				str=swap(str,l,i);
				permute(str,l+1,r);	//recursive call
				str=swap(str,l,i);  //backtracking
			}
		}
	}
	static String swap(String a,int i,int j) {
		char ch[]=a.toCharArray();
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return String.valueOf(ch);
		
	}
	public static void main(String x[]) {
		permutation p=new permutation();
		String str=sc.next();
		int n=str.length();
		p.permute(str,0,n-1);
	}
}
