import java.util.*;
public class arraySum {
	static Scanner sc=new Scanner(System.in);
	static void sum(int n1,int n2,int k) {
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		for(int j=0;j<n1;j++) {
			 arr1[j]=sc.nextInt();
					
		}
		for(int i=0;i<n1;i++) {
			 arr2[i]=sc.nextInt();
					
		}
		for(int l=0;l<n1;l++) {
			for(int m=0;m<n2;m++) {
				if(arr1[l]+arr2[m]==k)
					System.out.print(arr1[l]+" "+arr2[m]+",");
			}
		}
		
	}
	public static void main(String x[])
	{
		
		System.out.print("Enter length of first array:");
		int n1=sc.nextInt();
		System.out.print("Enter length of Second array:");
		int n2=sc.nextInt();
		System.out.print("Enter sum:");
		int k=sc.nextInt();
		sum(n1,n2,k);
	}
}
