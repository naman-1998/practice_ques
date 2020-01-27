<<<<<<< HEAD
import java.util.*;
public class secondLargest {
	static void find(int arr[])
	{
		int len=arr.length;
		int max=Integer.MIN_VALUE;
		int max1=Integer.MIN_VALUE;
		for(int i=0;i<len;i++) {
			if(arr[i]>max) {
				max1=max;
				max=arr[i];
			}
		}
		System.out.print(max1);
	}
public static void main(String x[]) {
	int arr[]= {1,3,2,4,5,7,10};
	find(arr);
}
}
=======
import java.util.*;
public class secondLargest {
	static void find(int arr[])
	{
		int len=arr.length;
		int max=Integer.MIN_VALUE;
		int max1=Integer.MIN_VALUE;
		for(int i=0;i<len;i++) {
			if(arr[i]>max) {
				max1=max;
				max=arr[i];
			}
		}
		System.out.print(max1);
	}
public static void main(String x[]) {
	int arr[]= {1,3,2,4,5,7,10};
	find(arr);
}
}
>>>>>>> 72146863f20fb153ee922b8f491d10386d2201f5
