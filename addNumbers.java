import java.util.*;
public class addNumbers {
	static void add(int n1,int n2) {
		while(n1>0) {
			n2++;
			n1--;
		}
		System.out.print(n2);
	}
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		add(n1,n2);
	}
}
