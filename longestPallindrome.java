import java.util.*;
public class longestPallindrome {
	static void check(String str) {
		int len=str.length();
		int start=0;  //variable to start a substring
		int low,high;
		int maxLength=1;
			for(int i=0;i<len;i++) {
				/// for even length palindrome in a string
				low=i-1;
				high=i;
				while(low>=0 && high<len && str.charAt(low)==str.charAt(high))
				{
					if(high-low+1>maxLength)
					{
						start=low;
						maxLength=high-low+1;
					}
					low--;
					high++;
				}	
			
		
			//for odd length palindrome in a string
				low=i-1;
				high=i+1;
				while(low>=0 && high<len && str.charAt(low)==str.charAt(high))
				{
					if(high-low+1>maxLength)
					{
						start=low;
						maxLength=high-low+1;
					}
					low--;
					high++;
				}
			}
		
		
		System.out.print(str.substring(start,start+maxLength));
		
	
	}
	public static void main(String x[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String: ");
		String str=sc.next();
		check(str);
	}
}
