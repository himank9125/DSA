package trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBySraddha {
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
	
	public void PreOrder(Node N) {
		if(N==null) {
			return;
		}
		System.out.print(N.data+" ");
		PreOrder(N.left);
		PreOrder(N.right);
	}
	
	public void levelOrder(Node N) {
		Queue<Node> q=new LinkedList<>();
		q.add(N);
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
	
	public int height(Node N) {
		if(N==null) {
			return 0;
		}
		return Math.max(height(N.left), height(N.right))+1;
	}
	
	public int diam(Node N) {
		if(N==null) {
			return 0;
		}
		int d1=diam(N.left);
		int d2=diam(N.right);
		int d3=height(N.left)+height(N.right)+1;
		return Math.max(d3, Math.max(d1, d2));
	}
	public int countNode(Node N) {
		if(N==null) {
			return 0;
		}
		return countNode(N.left)+countNode(N.right)+1;
	}
	
	public int sumOfNodes(Node N) {
		if(N==null) {
			return 0;
		}
		return sumOfNodes(N.left)+sumOfNodes(N.right)+N.data;
	}

	public static void main(String[] args) {
		int[] A= {1,2,4,-1,-1,5,6,8,-1,-1,9,-1,-1,7,-1,-1,3,-1,-1};
		TreeBySraddha tr=new TreeBySraddha();
		Node root=tr.input(A);
		tr.PreOrder(root);
		System.out.println();
		tr.levelOrder(root);
		System.out.println();
		System.out.println(tr.height(root));
		System.out.println(tr.diam(root));
		System.out.println(tr.countNode(root));
		System.out.println(tr.sumOfNodes(root));
	}

}
