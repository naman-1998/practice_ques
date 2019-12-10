package assignments;
import java.util.*;
public class insertMiddleLL {
	
	
		Node head;
		class Node{
			int data;
			Node next;
			Node(int d){
				data=d;
				next=null;
			}
		}
		void insertMiddle(int num)
		{
		
			Node slow=head;
			Node fast=head;
			
			while(fast!=null && fast.next!=null)
			{
				
				fast=fast.next.next;
				slow=slow.next;
				
		 	}
			Node new_Node=new Node(num);
			new_Node.next=slow.next;
			slow.next=new_Node;
			}
		void print() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	void insert(int key) {
			
			if(head==null) {
				head=new Node(key);
				return;
			}
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=new Node(key);
		}
		public static void main(String x[]) {
			insertMiddleLL list=new insertMiddleLL();
			Scanner sc=new Scanner (System.in);
			System.out.print("Enter size of LL:");
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				list.insert(sc.nextInt());
			}
			System.out.print("Enter the element you want to add at middle:");
			int num=sc.nextInt();
			list.insertMiddle(num);
			list.print();
		}
	}


