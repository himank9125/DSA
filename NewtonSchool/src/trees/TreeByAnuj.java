package trees;

import java.util.Scanner;

class Nodes{
	int data;
	Nodes left;
	Nodes right;
	
	Nodes(int data){
		this.data=data;
	}
}
public class TreeByAnuj {
//	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		TreeByAnuj obj=new TreeByAnuj();
		Nodes p=obj.createTree();
		print(p);
		

	}
	public static void print(Nodes T) {
		if(T==null) {
			return;
		}
		System.out.print(T.data+" ");
		print(T.left);		
		print(T.right);		
	}
	public Nodes createTree() {
		Scanner sc=new Scanner(System.in);
		Nodes root=null;
		System.out.println("Please enter the data:");
		int x=sc.nextInt();
		if(x==-1) {
			return null;
		}
		root=new Nodes(x);
		System.out.println("Enter Left data for "+x);
		root.left=createTree();
		System.out.println("Enter Right Data for "+x);
		root.right=createTree();
		return root;
	}

}
