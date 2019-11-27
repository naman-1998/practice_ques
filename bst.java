import java.util.*;

public class bst {
	class Node{
		int key;
		Node left,right;
		Node(int item){
			key=item;
			left=right=null;
		}
	
	}
	Node root;
	bst(){
		root=null;
	}
	bst(int x){
		root=new Node(x);
	}
	//A recursive function to insert a new key in BST
		Node insertRec(Node root,int key) {
			//if the tree is empty,return a new node
			if(root==null) {
				root=new Node(key);
			}
			//Otherwise,recur down the tree
			if(key<root.key)
				root.left=insertRec(root.left,key);
			else if(key>root.key)
				root.right=insertRec(root.right,key);
			//return the (unchanged) node pointer
			return root;
		}
		void inOrder(Node root) {
			if(root!=null) {
				inOrder(root.left);
				System.out.println(root.key);
				inOrder(root.right);
			}
		}
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		int size=sc.nextInt();
		int a=sc.nextInt();
		bst tree=new bst(a);
		for(int i=0;i<size;i++) {
			tree.insertRec(tree.root,sc.nextInt());
		}
		tree.inOrder(tree.root);
	}

}
