package aug12;
class Node{
	int x;
	Node next;
	Node(int x){
		this.x=x;
	}
}
public class Moc {
	Node head;

	public static void main(String[] args) {
		Moc list=new Moc();
		for(int i=0;i<6;i++) {
			list.input(i);
		}
		list.print(list.head);
		System.out.println();
		Node k=list.reverse(list.head);
		list.print(k);
		
	}
	public Node input(int val) {
		Node nNode=new Node(val);
		if(this.head==null) {
			this.head=nNode;
		}
		else {
			nNode.next=this.head;
			this.head=nNode;
		}
		return this.head;
	}
	
	public Node reverse(Node hs) {
		Node temp=hs;
		Node rev=null;
		while(temp!=null) {
			Node x=temp.next;
			temp.next=rev;
			rev=temp;
			temp=x;
		}
		return rev;
	}
	
	public void print(Node N) {
		while(N!=null) {
			System.out.print(N.x+" ");
			N=N.next;
		}
	}

}
