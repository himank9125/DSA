package prc08oct;

class Node{
	int val;
	Node next;
	Node(int val){
	this.val=val;
	next=null;
	}
}

public class Moc {
	public static Node input(Node head, int val) {
		Node nNode=new Node(val);
		if(head==null) {
			head=nNode;
			return head;
		}
		nNode.next=head;
		head=nNode;
		return head;
		
	}
	
	public static void printNodes(Node head) {
		while(head!=null) {
			System.out.print(head.val+" ");
			head=head.next;
		}
	}
	
	public static Node remove(Node head) {
		Node temp=head;
		while(temp.next.next.next!=null) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		return head;
	}
	
	public static Node reverse(Node head) {
		Node pre=null;
		Node temp=head;
		while(temp!=null) {
			Node tt=temp.next;
			temp.next=pre;
			pre=temp;
			temp=tt;
		}
		return pre;
	}

	public static void main(String[] args) {
		Node head=null;
		for(int i=0;i<5;i++) {
			head=input(head,i);
		}
		printNodes(head);
		System.out.println();
//		Node hh=remove(head);
//		printNodes(head);
		System.out.println();
		Node rr=reverse(head);
		printNodes(rr);
	}

}
