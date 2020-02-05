import java.util.*;
public class minStack {
	static void min(Stack<Integer> st) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		while(!st.isEmpty()) {
			
			arr.add(st.pop());
		}
		Collections.sort(arr);
		System.out.print(arr.get(0));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer>st=new Stack<Integer>();
		st.add(20);
		st.add(12);
		st.add(122);
		st.add(3);
		st.add(32);
		st.add(50);
		min(st);

	}

}
