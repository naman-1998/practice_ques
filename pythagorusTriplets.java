import java.util.*;
public class pythagorusTriplets {
	static void check(int arr[],int size) {
		int c=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				for(int k=i+2;k<size;k++) {
					int x=arr[i]*arr[i];
					int y=arr[j]*arr[j];
					int z=arr[k]*arr[k];
					if(x==y+z || y==x+z || z==x+y)
					{
						System.out.println("Yes");
						c++;
					}
				}
			}
		}
		if(c==1)
			System.out.println("yes!");
		else
			System.out.println("No!");
	}
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int size=sc.nextInt();
			int arr[]=new int[size];
			for(int j=0;j<size;j++) {
				arr[j]=sc.nextInt();
			}
			check(arr,size);
		}
	}
}
