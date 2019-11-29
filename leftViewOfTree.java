import java.util.*;
class Node{
	int key;
	Node left,right;
	Node(int item){
		key=item;
		left=right=null;
	}
	
}
public class leftViewOfTree {
	Node root;
	leftViewOfTree(){
		root=null;
	}
	leftViewOfTree(int key){
		root=new Node(key);
	}
	
	//can be done by level order traversal
	//have to print the first node at any level
	static void levelOrder(Queue<Node> q1) 
	{
		if(q1.isEmpty())
			return;
		Queue<Node> q=new LinkedList<Node>();
		while(!q1.isEmpty()) {
			
			Node temp=q1.poll();
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
		if(!q.isEmpty())
			System.out.println(q.peek().key);
		levelOrder(q);
	}
	public static void main(String x[]) {
		leftViewOfTree tree=new leftViewOfTree();
		tree.root=new Node(12);
		tree.root.left=new Node(10);
		tree.root.right=new Node(30);
		tree.root.left.left=new Node(25);
		tree.root.left.right=new Node(33);
		tree.root.left.right.right=new Node(199);
		Queue<Node> q=new LinkedList<Node>();
		q.add(tree.root);
		System.out.println(tree.root.key);
		levelOrder(q);
	}
}
