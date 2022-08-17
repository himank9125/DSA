package tree16aug;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class Tree{
	int i=-1;
	public Node input(int[] x) {
		i++;
		if(x[i]==-1) {
			return null;
		}
		Node nNode=new Node(x[i]);
		nNode.left=input(x);
		nNode.right=input(x);
		return nNode;
	}
	public void print(Node h) {
		if(h==null) {
//			System.out.print(-1+" ");
			return;
		}
		System.out.print(h.data+" ");
		print(h.left);
		print(h.right);
	}
}

public class TreeStruct {

	public static void main(String[] args) {
		Tree tt=new Tree();
		int[]arr= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node hs=tt.input(arr);		
		tt.print(hs);
		

	}

}
