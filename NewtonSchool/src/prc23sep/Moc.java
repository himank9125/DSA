package prc23sep;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int val;
	Node left;
	Node right;
	Node(int val){
		this.val=val;
		this.left=null;
		this.right=null;
	}
}

public class Moc {
	int i=-1;
	public Node input(int[] arr) {
		i++;
		if(arr[i]==-1) {
			return null;
		}
		Node nNode=new Node(arr[i]);
		nNode.left=input(arr);
		nNode.right=input(arr);
		return nNode;
	}
	
	public void print(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.val+" ");
		print(root.left);
		print(root.right);
	}
	
	public void printLOrder(Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node x=q.poll();
			System.out.print(x.val+" ");
			if(x.left!=null) {
				q.add(x.left);
			}
			if(x.right!=null) {
				q.add(x.right);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,2,4,-1,-1,5,-1,-1,3,-1,-1,};
		Moc mm=new Moc();
		Node root=mm.input(arr);
		mm.printLOrder(root);
//		mm.print(root);

	}

}
