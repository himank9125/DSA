package prc13jul;
class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}

public class LLPRC {
	Node head;
	public Node InsertAtFirst(int data) {
		Node nObj=new Node(data);
		if(this.head!=null) {
			nObj.next=this.head;;
		}
		this.head=nObj;
		return this.head;
	}
	public Node insertAtEnd(int data) {
		Node tail=this.head;
		Node nObj=new Node(data);
		if(this.head==null) {
			this.head=nObj;
		}
		else {
			while(tail.next!=null) {
				tail=tail.next;
			}
			tail.next=nObj;
		}
		return this.head;
	}
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val);
			temp=temp.next;
		}
	}
	public int peek() {
		return this.head.val;
	}
	public boolean isEmpty() {
		if(this.head==null) {
			return true;
		}
		return false;
	}
	public void removeAtIndex(int idx) {
		Node temp=this.head;
		Node prev=temp;
		while(temp.next!=null && idx>0) {
			temp=temp.next;
			idx--;
		}
		if(idx==1) {
			prev.next=temp.next;
			System.out.printf("the Data of index %d has been removed",idx);
		}
		else {
			System.out.print("Index Out of Bound");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
