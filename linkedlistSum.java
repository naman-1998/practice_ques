import java.util.*;
public class linkedlistSum {
	
		static Node head1,head2;
		Node result;
		String str1="";
		String str2="";
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
		}
	}
	public void push(int item,int num) {
		if(num==1) {
		Node node=new Node(item);
		if(head1==null) {
			head1=node;
			return;
		}
		node.next=head1;
		head1=node;
		}
		else if(num==2)
		{
			Node node=new Node(item);
			if(head2==null) {
				head2=node;
				return;
			}
			node.next=head2;
			head2=node;
		}
		else {
			Node node=new Node(item);
			if(result==null) {
				result=node;
				return;
			}
			node.next=result;
			result=node;
			//System.out.print(result.data);
		}
	}
	
 public  void addLL(Node head1,Node head2) {
	 Node temp=head1;
	 while(temp!=null) {
		 str1=str1+temp.data;
		 temp=temp.next;
	 }
	 temp=head2;
	 while(temp!=null) {
		 str2=str2+temp.data;
		 temp=temp.next;
	 }
	 int num1=Integer.parseInt(str1);
	 int num2=Integer.parseInt(str2);
	 int res=num1+num2;
	 while(res!=0) {
		 int rem=res%10;
		 push(rem,3);
		 res=res/10;
	 }
	 
 }
 void printList(Node head) {
	 Node temp=head;
	 while(temp!=null)
	 {
		 System.out.print(temp.data+" ");
		 temp=temp.next;
	 }
	 
 }
	
	public static void main(String x[]) {
		linkedlistSum ll=new linkedlistSum();
		Scanner sc=new Scanner(System.in);
		
		
			System.out.print("Enter the size of first list");
			int size1=sc.nextInt();
			for(int j=0;j<size1;j++) {
				System.out.print("Enter value "+ j);
				ll.push(sc.nextInt(),1);
				
			}
			System.out.print("enter size of second list");
			int size2=sc.nextInt();
			for(int k=0;k<size2;k++) {
				System.out.print("Enter value "+k);
				ll.push(sc.nextInt(),2);
			}
			
		
		ll.addLL(head1,head2);
		ll.printList(ll.result);
		
	}
}
