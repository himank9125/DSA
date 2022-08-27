package prc26august;
class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
		this.next=null;
	}
}

public class Linked {

	public static void main(String[] args) {
		Linked ll=new Linked();
		Node head=null;
		for(int i=0;i<6;i++) {
			head=ll.insert(head, i);
		}
		ll.print(head);
		System.out.println();
		Node X=ll.deletebyIdx(head, 7);
		ll.print(X);
	}
	public Node insert(Node N, int x) {
		Node nn=new Node(x);
		if(N!=null) {
			nn.next=N;
		}
		N=nn;
		return N;
	}
	
	public void print(Node N) {
		if(N==null) {
			return;
		}
		while(N!=null) {
			System.out.print(N.val+" ");
			N=N.next;
		}
	}
	
	public Node reverse(Node N) {
		if(N==null) {
			return N;
		}
		Node rev=null;
		Node T=N;
		while(T!=null) {
			Node temp=T.next;
			T.next=rev;
			rev=T;
			T=temp;
		}
		return rev;
	}
	
	public Node deletebyIdx(Node N, int idx) {
		if(idx==1) {
			return N.next;
		}
		Node temp=N;
		while(temp.next!=null && idx>2) {
			temp=temp.next;
			idx--;
		}
		if(temp.next==null) {			
			System.out.println("invalid idx value");
			return N;
		}
		temp.next=temp.next.next;
		return N;
	}
}
