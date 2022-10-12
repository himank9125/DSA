package trees;
class Tree{
	int data;
	Tree left;
	Tree right;
	Tree(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

public class Him {
	int i=-1;
	public Tree input(Tree root,int[] x) {
		i++;
		if(x[i]==-1) {
			return null;
		}
		Tree tr=new Tree(x[i]);
		root=tr;
		root.left=input(root.left,x);
		root.right=input(root.right,x);
		return root;
	}
	
	public void print(Tree root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		print(root.left);
		print(root.right);
	}

	public static void main(String[] args) {
		Tree root=null;
		int[] A= {1,2,4,-1,-1,5,6,8,-1,-1,9,-1,-1,7,-1,-1,3,-1,-1};
		Him hh=new Him();
		root=hh.input(root, A);
		hh.print(root);
	}

}
