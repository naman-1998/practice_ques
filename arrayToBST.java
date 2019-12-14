import java.util.*;
public class arrayToBST {
	static class Node{
		int key;
		Node left,right;
		Node(int item){
			key=item;
			left=right=null;
		}
	}
	static Node root;
	static Node convert(int arr[],int start,int end) {
		if(start>end)
			return null;
		int mid=(start+end)/2;
		 Node node = new Node(arr[mid]); 
		node.left=convert(arr,0,mid-1);
		node.right=convert(arr,mid+1,end);
		return node;
	}
	static void print(Node node) {
		if(root==null)
			return;
		System.out.print(node.key+" ");
		print(node.left);
		print(node.right);
	}
	public static void main(String x[]) {
		int arr[]= {1,2,3,4,5,6,7};
		int n=arr.length;
		//passing parameters to print 
		root=convert(arr,0,n-1);
		print(root);
	}
}
