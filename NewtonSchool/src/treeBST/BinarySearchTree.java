package treeBST;

class Node{
	int val;
	Node left;
	Node right;
	Node(int val){
		this.val=val;
		left=null;
		right=null;
	}
}

public class BinarySearchTree {
	
	public Node inputBST(Node root,int x) {
		if(root==null) {
			Node nNode=new Node(x);
			return nNode;
		}
		if(x<root.val) {
			root.left=inputBST(root.left,x);
		}
		if(x>root.val) {
			root.right=inputBST(root.right,x);
		}
		return root;
	}
	
	public void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.val+" ");
		inorder(root.right);
	}
	
	public boolean search(Node root,int x) {
		if(root==null) {
			return false;
		}		
		if(x<root.val) {
			return search(root.left,x);
		}
		else if(x>root.val){
			return search(root.right,x);
		}
		else return true;
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		int[] arr= {1,4,2,5,3,8,6,7,9,55,12,42,18,19,32};
		Node N=null;
		for(int i=0;i<arr.length;i++) {
			N=bst.inputBST(N, arr[i]);
		}
		bst.inorder(N);
		System.out.println();
		System.out.println(bst.search(N, 11));
	}

}
