import java.util.*;
public class removeAdjacentDuplicates {
	 static  String remove(String str)
	 {
		if(str.length()==0 || str.length()==1)
			return str;
	for(int i=0;i<str.length()-1;i++) {
		if(str.charAt(i)==str.charAt(i+1))
		{
			return remove(str.substring(0,i).concat(str.substring(i+2)));
		}
	}
	return str;
		
	}
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String str=sc.next();
		 String str1=remove(str);
		System.out.print("Updated string is: "+str1);
	}
}
