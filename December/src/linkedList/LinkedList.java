package linkedList;
class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
		next=null;
	}
}
class Operations{
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
}

public class LinkedList {

	public static void main(String[] args) {
		Operations ll=new Operations();
		Node head = null;
		head=ll.input(head,2);
		head=ll.input(head,5);
		head=ll.input(head,9);
		head=ll.input(head,8);
		ll.print(head);
		
		

	}
	

}
