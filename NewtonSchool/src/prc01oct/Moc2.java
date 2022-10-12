package prc01oct;

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
public class Moc2 {
	int i=-1;
	public Node input(int arr[]) {
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
		print(root.left);
		print(root.right);
		System.out.print(root.val+" ");
	}

	public static void main(String[] args) {
		Moc2 mm=new Moc2();
		int[] arr= {1,2,4,-1,-1,5,-1,-1,3,-1,-1};
		Node root=mm.input(arr);
		mm.print(root);
	}

}
