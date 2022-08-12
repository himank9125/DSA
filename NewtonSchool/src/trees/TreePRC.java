package trees;

import java.util.Scanner;

public class TreePRC {

	public static void main(String[] args) {
		Node root=null;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			root=insert(root,i);
		}
		print(root);
		

	}
	public static Node insert(Node root,int x) {
		if(root==null) {
			return new Node(x);
		}
		root.left=insert(root.left,x);
		root.right=insert(root.right,x);
		return root;
	}
	public static void print(Node root) {
		if(root==null) {
			return;
		}
		print(root.left);
		print(root.right);
		System.out.print(root.data);
	}

}
