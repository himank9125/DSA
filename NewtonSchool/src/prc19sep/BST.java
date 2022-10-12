package prc19sep;
class BstEmp{
	public Node input(Node root,int val) {
		if(root==null) {
			Node nNode=new Node(val);
			root=nNode;
			return root;
		}
		if(val<root.x) {
			root.left=input(root.left,val);
		}
		if(val>root.x) {
			root.right=input(root.right, val);
		}
		return root;
	}
	
	public boolean findVal(Node root, int elm) {
		if(root==null) {
			return false;
		}
		if(elm>root.x) {
			return findVal(root.right,elm);
		}
		else if(elm<root.x){
			return findVal(root.left,elm);
		}
		return true;
	}
	
	public void print(Node root) {
		if(root==null) {
			return;
		}
		print(root.left);
		System.out.print(root.x+" ");
		print(root.right);
	}
}

public class BST {

	public static void main(String[] args) {
		Node root=null;
		int[] arr= {9,5,1,8,14,21,3,2,24};
		BstEmp nn=new BstEmp();
		for(int i=0;i<arr.length;i++) {
			root=nn.input(root, arr[i]);
		}
		nn.print(root);
		System.out.println();
		System.out.println(nn.findVal(root, 25));
	}

}
