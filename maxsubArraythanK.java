import java.util.*;
public class maxsubArraythanK {
		 static void countSubArray(int arr[],int k ) {
			 int len=arr.length;
			 int count=0;
			 for(int i=0;i<len;i++) {
				 for(int j=i;j<=len;j++) {
					 for(int m=i;m<j;m++) {
						 if(arr[m]>k)
							 count++;
				 }
					 
					 }
				
			 }
			 System.out.print("Count: "+count);
			 
		}
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Take Array Inputs");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element you want to compare with:");
		int k=sc.nextInt();
		countSubArray(arr,k);
		
	}

}
