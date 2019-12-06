import java.util.*;
public class highestPrime {
	//ArrayList<Integer> arr=new ArrayList<Integer>();
	  void prime(int n) {
		 int max=1;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) 
			{
				int c=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
						c++;
						
				}
				if(c==2)
					max=i;
			}
				
		}
		
		System.out.print("Highest Prime Factor is:"+ max);
	}
	public static void main(String x[]) 
	{
		highestPrime h=new highestPrime();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		h.prime(n);
	}
}
