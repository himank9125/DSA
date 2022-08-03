package trees;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
	}
}
class BinTree{
	Node tree;
	 
//	BinTree(){
//		this.tree=null;
//	}
//	
//	BinTree(int x){
//		this.tree=new Node(x);
//	}
	
	public void traversal() {
		printTree(this.tree);
	}
	
	public void printTree(Node tr) {
		if(tr==null) {
			return;
		}
		System.out.print(tr.data+" ");
		printTree(tr.left);
		printTree(tr.right);
				
	}
	
	public void insert(int x) {
		this.tree=add(this.tree,x);
	}
	
	
	public Node add(Node tr, int x) {
		Node nNode=new Node(x);
		if(tr==null) {
			tr=nNode;
			return tr;
		}
		if(tr.left==null) {
			tr.left=add(tr.left,x);
		}
		else {
			tr.right=add(tr.right,x);
		}
		return tr;
		
	}
	
	
}

public class TreeInClass {

	public static void main(String[] args) {
		BinTree bt=new BinTree();
//		Node ss=null;
		for(int i=0;i<6;i++) {
			bt.insert(i);
//			ss=bt.add(bt.tree, i);
		}
		bt.traversal();
//		bt.printTree(ss);
		


	}

}
