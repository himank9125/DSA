package linkedList;

class OperationRev{
	public Node input(Node head, int val) {
		Node nObj=new Node(val);
		if(head==null) {
			head=nObj;
		}
		else {
			nObj.next=head;
			head=nObj;		
		}
		return head;
	}
	public void print(Node head) {
		while(head!=null) {
			System.out.print(head.val+" ");
			head=head.next;
		}
	}
	public Node Reverse(Node head) {
		Node rev=null;
		Node prev=head;
		while(prev!=null) {
			Node temp=prev.next;
			prev.next=rev;
			rev=prev;
			prev=temp;
		}
		return rev;
	}
}
public class Reverse {

	public static void main(String[] args) {
		OperationRev ll=new OperationRev();
		Node head = null;
		head=ll.input(head,2);
		head=ll.input(head,5);
		head=ll.input(head,9);
		head=ll.input(head,8);
		ll.print(head);
		System.out.println();
		head=ll.Reverse(head);
		ll.print(head);
		System.out.println();
		

	}

}
