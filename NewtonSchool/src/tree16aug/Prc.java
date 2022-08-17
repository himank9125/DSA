package tree16aug;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Node from Treestruct

class PrcTree{
	int i=-1;
	int count=0;
	public Node input(int[]x) {
		i++;
		if(x[i]==-1) {
			return null;
		}
		Node nNode=new Node(x[i]);
		nNode.left=input(x);
		nNode.right=input(x);
		return nNode;
	}
	
	public void printPreOrder(Node x) {
		if(x==null) {
			return;
		}
		System.out.print(x.data+" ");
		printPreOrder(x.left);
		printPreOrder(x.right);
	}
	public void printInOrder(Node root) {
		if(root==null) {
			return;
		}
		printInOrder(root.left);
		System.out.print(root.data+" ");
		printInOrder(root.right);
	}
	public void printPostOrder(Node root) {
		if(root==null) {
			return;
		}
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	public int nodeCount(Node root) {
		if(root==null) {
			return 0;
		}
		this.count++;
		nodeCount(root.left);
		nodeCount(root.right);
		return this.count;
	}
	
	public int nodeCount2(Node N) {
		if(N==null) {
			return 0;
		}
//			int l=nodeCount2(N.left);
//			int r=nodeCount2(N.right);
//			return l+r+1;	
		return nodeCount2(N.left)+nodeCount2(N.right)+1;
	}
	public int sumOfNodes(Node N) {
		if(N==null) {
			return 0;
		}
		return sumOfNodes(N.left)+sumOfNodes(N.right)+N.data;
	}
	
	public int height(Node N) {
		if(N==null) {
			return 0;
		}
		if(height(N.left)>=height(N.right)) {
			return height(N.left)+1;
		}
		else {
			return height(N.right)+1;
		}
	}
	public int Diameter(Node N) {
		if(N==null) {
			return 0;
		}
		int d1=Diameter(N.left);
		int d2=Diameter(N.right);
		int d3=height(N.left)+height(N.right)+1;
		return Math.max(d1, Math.max(d2, d3));
	}
	
	public void printlevelOrder(Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
				if(q.peek().left!=null) {
					q.add(q.peek().left);
				}
				if(q.peek().right!=null) {
					q.add(q.peek().right);
				}
				System.out.print(q.poll().data+" ");			
		}
	}
	
}

public class Prc {

	public static void main(String[] args) {
		PrcTree pp=new PrcTree();
		int[]arr= {1,2,4,-1,-1,5,6,8,-1,-1,9,-1,-1,7,-1,-1,3,-1,-1};
		Node root=pp.input(arr);
		System.out.println("pre Order Traversal");
		pp.printPreOrder(root);
		System.out.println();
		System.out.println("Post Order Traversal");
		pp.printPostOrder(root);
		System.out.println();
		System.out.println("In Order Traversal");
		pp.printInOrder(root);
		System.out.println();
		System.out.println("Level Order Traversal");
		pp.printlevelOrder(root);
		System.out.println();
		System.out.println("Total Number of Nodes in Tree "+pp.nodeCount(root));
		System.out.println("Toatal number of Noder in Tree by 2nd method "+pp.nodeCount2(root));
		System.out.println("Total sum of Nodes= "+pp.sumOfNodes(root));
		System.out.println("Height of Tree = "+pp.height(root));
	}

}
