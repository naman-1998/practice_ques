import java.util.*;
public class largestNumber {
	static void largest(int arr[])
	{
		//Arrays.sort(arr);
		int len=arr.length;
		String arr1[]=new String[len];
		//Converting int array to String Array
		for(int j=0;j<len;j++) {
			arr1[j]=String.valueOf(arr[j]);
		}
		//Sorting array with comparator
		Arrays.sort(arr1,new Comparator<String>(){
			public int compare(String a,String b) {
				return (b+a).compareTo(a+b);
			}
		});
		String str="";
		for(int i=0;i<len;i++) {
			str+=arr1[i];
		}
		int result=Integer.parseInt(str);
		System.out.print("Largest Number is: "+result);
	}
	public static void main(String x[]) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		largest(arr);
	}
}