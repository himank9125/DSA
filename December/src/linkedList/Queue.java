package linkedList;
//class Node{
//	int val;
//	Node next;
//	Node(int val){
//		this.val=val;
//		next=null;
//	}
//}
class QueueStr{
	public Node input(Node head, int val) {
		Node nNode=new Node(val);
		if(head==null) {
			head=nNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=nNode;
		}
		return head;
	}
	public void print(Node head) {
		while(head!=null) {
			System.out.print(head.val+" ");
			head=head.next;
		}
	}
}
public class Queue {

	public static void main(String[] args) {
		QueueStr ll=new QueueStr();
		Node head=null;
		head=ll.input(head,2);
		head=ll.input(head,5);
		head=ll.input(head,9);
		head=ll.input(head,8);
		ll.print(head);

	}

}
