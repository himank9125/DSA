package prc13oct;

class Node{
	int x;
	Node left;
	Node right;
	Node(int x){
		this.x=x;
		left=null;
		right=null;
	}
}

public class Moc {
	int i=-1;
	public Node createTree(int[] arr) {
		i++;
		if(arr[i]==-1) {
			return null;
		}
		Node nNode=new Node(arr[i]);
		nNode.left=createTree(arr);
		nNode.right=createTree(arr);
		return nNode;
	}
	
	public int height(Node root) {
		if(root==null) {
			return 0;
		}
		return Math.max(height(root.left), height(root.right))+1;
	}
	
	public int diameter(Node root) {
		if(root==null) {
			return 0;
		}
		int x=diameter(root.left);
		int y=diameter(root.right);
		int z=height(root.left)+height(root.right)+1;
		return Math.max(Math.max(y, x),z);
	}
	

	public static void main(String[] args) {
		int[] arr= {1,2,4,-1,-1,5,-1,-1,3,-1,-1};
		Moc mm=new Moc();
		Node root=mm.createTree(arr);
		System.out.println(mm.diameter(root));
	}

}
