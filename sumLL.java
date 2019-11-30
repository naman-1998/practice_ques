import java.util.*;
public class sumLL {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void insert(int item) {
		if(head==null)
		{
			head=new Node(item);
			return;
		}
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=new Node(item);
	}
	public static void main(String x[]) {
		sumLL list1=new sumLL();
		sumLL list2=new sumLL();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of list 1:");
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			list1.insert(sc.nextInt());
		}
	
		System.out.print("Enter size of list 2:");
		int n2=sc.nextInt();
		for(int j=0;j<n2;j++)
		{
			list2.insert(sc.nextInt());
		}
		
	}
}
