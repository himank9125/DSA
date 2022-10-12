package prc04sep;
class Node{
	int x;
	Node next;
	Node(int x){
		this.x=x;
		this.next=null;
	}
}

public class Moc2 {
	
	public Node input(Node head, int x) {
		Node nn=new Node(x);
		if(head!=null) {
			nn.next=head;
		}
		head=nn;
		return head;
	}
	
	public void print(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.x+" ");
			temp=temp.next;
		}
	}
	
	public Node reverseLL(Node head) {
		Node pre=null;
		Node hh=head;
		while(hh!=null) {
			Node temp=hh.next;
			hh.next=pre;
			pre=hh;
			hh=temp;
		}
		return pre;
	}

	public static void main(String[] args) {
		Moc2 mm=new Moc2();
		Node head=null;
		for(int i=0;i<9;i++) {
			head=mm.input(head,i);
		}
		mm.print(head);
		Node R=mm.reverseLL(head);
		System.out.println();
		mm.print(R);
	}
	
	
}
