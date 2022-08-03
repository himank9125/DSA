package trees;

import java.util.Scanner;

public class Createtree {

	public static void main(String[] args) {
		Node p=treeInput();
		print(p);
		

	}
	public static Node treeInput() {
		Scanner sc=new Scanner(System.in);
		Node root=null;
		int x=sc.nextInt();
		if(x==-1) {
			return null;
		}
		root=new Node(x);
		root.left=treeInput();
		root.right=treeInput();
		return root;
	}
	public static void print(Node N) {
		if(N==null) {
			return;
		}
		System.out.print(N.data+" ");
		print(N.left);
		print(N.right);
	}

}
