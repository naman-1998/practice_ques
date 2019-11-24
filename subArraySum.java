import java.util.*;
public class subArraySum {
	 static void arraySum(int arr[],int k)
	{
	
		 int len=arr.length;
		 for(int i=0;i<len;i++)
		 {
			
			 for(int j=i;j<len;j++)
			 { 
				 int sum=0;
				 for(int m=i;m<=j;m++)
				 {
					 sum=sum+arr[m];
					
				 }
				 if(sum==k)
						System.out.println("Starting index:"+i+" "+"ending index:"+j);
				 }
			 }
		 }
	
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		arraySum(arr,k);
	}
}
