import java.util.*;
public class reverseStringNoChar {
	 static Scanner sc=new Scanner(System.in);
	 static void func(String str) {
		int len=str.length();
		int i=0,j=len-1;
		char arr[]=str.toCharArray();
		while(i<j) {
			if(arr[i]>=65 && arr[i]<=90 || arr[i]>=97 && arr[i]<=122)
			{
				if(arr[j]>=65 && arr[j]<=90 || arr[j]>=97 && arr[j]<=122)
			{
					char t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
					i++;
					j--;
					
				
			}
				else
				{
					j--;
				}
			}
				else
				{
				i++;
				}
		}
		arr.toString();
		System.out.print(arr);
	}
	public static void main(String x[])
	{
		
		String str=sc.next();
		func(str);
	}

}
