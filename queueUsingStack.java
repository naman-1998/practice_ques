import java.util.*;
public class queueUsingStack {
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of stack");
		int n=sc.nextInt();
		Stack<Integer> st1=new Stack<Integer>();
		Stack<Integer> st2=new Stack<Integer>();
		for(int i=0;i<n;i++) {
			st1.push(sc.nextInt());
		}
		while(!st1.isEmpty()) {
			st2.push(st1.pop());
		}
		while(!st2.isEmpty()) {
			System.out.print(st2.pop()+" ") ;
		}
	}
}
