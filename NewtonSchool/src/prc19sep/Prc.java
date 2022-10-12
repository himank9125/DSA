package prc19sep;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int x;
	Node left;
	Node right;
	Node(int x){
		this.x=x;
		this.left=null;
		this.right=null;
	}
	
}
class Tree{
	int i=-1;
	public Node input(int[]arr) {
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
		System.out.print(root.x+" ");
		print(root.left);
		print(root.right);
	}
	
	public int sum(Node root) {
		if(root==null) {
			return 0;
		}
		return root.x+sum(root.left)+sum(root.right);
	}
	
	public int count(Node root) {
		if(root==null) {
			return 0;
		}
		return 1+count(root.left)+count(root.right);
	}
	
	public int height(Node root) {
		if(root==null) {
			return 0;
		}
		int l=height(root.left);
		int r=height(root.right);
		return 1+(Math.max(l, r));
	}
	public int diameter(Node root) {
		if(root==null) {
			return 0;
		}
		int l=diameter(root.left);
		int r=diameter(root.right);
		int d=height(root.left)+height(root.right)+1;
		return Math.max(d,Math.max(r, l));
	}
	
	public void printBFS(Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node elm=q.poll();
			System.out.print(elm.x+" ");
			if(elm.left!=null) {
				q.add(elm.left);
			}
			if(elm.right!=null) {
				q.add(elm.right);
			}
		}
	}
	
	public int heightBFS(Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		int count=0;
		
		while(!q.isEmpty()) {
			int el=q.size();
			while(el-->0) {
				Node hs=q.poll();
				if(hs.left!=null) {
					q.add(hs.left);
				}
				if(hs.right!=null) {
					q.add(hs.right);
				}
				
			}
			count++;
		}
		return count;
	}
}

public class Prc {

	public static void main(String[] args) {
		int[]arr= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Tree tr=new Tree();
		Node root=tr.input(arr);
		tr.print(root);
		System.out.println();
		System.out.println(tr.sum(root));
		System.out.println(tr.count(root));
		System.out.println(tr.height(root));
		System.out.println(tr.diameter(root));
		tr.printBFS(root);
		System.out.println();
		System.out.println(tr.heightBFS(root));

	}

}
