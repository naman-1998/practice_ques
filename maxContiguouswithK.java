import java.util.*;
public class maxContiguouswithK {
	
	static void find(int arr[],int k) {
		int len=arr.length;
		
		for(int i=0;i<len-k;i++) {
			int max=Integer.MIN_VALUE;	
			for(int j=i;j<=(i+k);j++) {
				if(max<arr[j])
				{
					max=arr[j];
				
				
				}
			}
			System.out.print(max+" ");
		}
		
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int k=sc.nextInt();
		find(arr,k);
		
	}

}
