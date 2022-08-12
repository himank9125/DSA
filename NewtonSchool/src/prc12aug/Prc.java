package prc12aug;
class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}

public class Prc {
	Node head;

	public static void main(String[] args) {
		Prc obj=new Prc();
		for(int i=0;i<10;i++) {
			obj.input(i);
		}
//		obj.print(obj.head);
//		System.out.println();
//		Node hh=obj.reverse(obj.head);
//		obj.print(hh);
//		System.out.println();
//		obj.print(obj.head);
		System.out.println();
		System.out.println(obj.checkPalendrome(obj.head));
		

	}
	public Node input(int x) {
		Node n=new Node(x);
		if(this.head==null) {
			this.head=n;
		}
		else {
			n.next=this.head;
			this.head=n;
		}
		return this.head;
	}
	
	public void print(Node hd) {
		while(hd!=null) {
			System.out.print(hd.val+" ");
			hd=hd.next;
		}
	}
	
	public Node reverse(Node v) {
		Node pre=null;
		Node hd=v;
		while(hd!=null) {
			Node temp=hd.next;
			hd.next=pre;
			pre=hd;
			hd=temp;
		}
		return pre;
	}
	
	public boolean checkPalendrome(Node head) {
		Node slow =head;
		Node fast=head;
		Node rev=null;
		while(fast!=null && fast.next!=null) {
			Node temp=slow.next;
			slow.next=rev;
			rev=slow;
			slow=temp;
			fast=fast.next.next;
		}
		
		if(fast!=null) {
			slow=slow.next;
		}
		while(slow!=null) {
			if(rev.val!=slow.val) {
				return false;
			}
			slow=slow.next;
			rev=rev.next;
		}
		return true;
	}

}
