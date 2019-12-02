/*Given an array of n integers where each value represents number of chocolates in a packet. Each packet can have variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.

Examples:

Input : arr[] = {7, 3, 2, 4, 9, 12, 56}
m = 3

Output: Minimum Difference is 2 */


import java.util.*;
public class chocolateProb {
	static void func(int arr[],int m) {
		if(arr.length==0|| m==0)
			System.out.print("0");
		int min=Integer.MAX_VALUE;
		Arrays.sort(arr);
		int n=arr.length;
		for(int i=0;i<n-m+1;i++) {
			for(int j=i+m-1;j<n;j++) {
				if(arr[j]-arr[i]<min)
					min=arr[j]-arr[i];
				
			}
		
		}
		System.out.println(min);
	}
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		func(arr,m);
	}
}
