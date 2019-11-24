import java.util.*;
public class reverseDoublyLL {
	static class Node
	{
		int data;
		Node next,previous;
		
		Node(int data )
		{
			this.data=data;
			next=previous=null;
		}
	}
	
	Node head;
	
	reverseDoublyLL()
	{
		head=null;
	}
	
	void insert(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		Node t=head;
		while(t.next!=null)
		{
			t=t.next;
		}
		t.next=temp;
		temp.previous=t;
		
	}
	
	Node reverse(Node node) {
		
		Node prev=null;
		Node current=node;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		node=prev;
		return node;
		
	}
	
	void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		reverseDoublyLL obj=new reverseDoublyLL();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		
		System.out.println("enter nodes");
		
		for(int i=0;i<n;i++)
		{
			obj.insert(sc.nextInt());
		}
		obj.head=obj.reverse(obj.head);
		System.out.println("Reversed Doubly Linked List:");
		obj.print();
	}

}