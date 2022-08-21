package prc21Aug;
class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}

public class Moc {

	public static void main(String[] args) {
		Moc mm=new Moc();
		Node head=null;
		int[] arr= {5,7,8,4,2,1};
		for(int i=0;i<arr.length;i++) {
			head=mm.input(head, arr[i]);
		}
		mm.print(head);
//		Node cir=mm.makingCirculer(head);
//		
//		System.out.println(mm.detectAndRemoveLoop(cir));
		System.out.println();
		Node N=mm.removeOddPos(head);
		mm.print(N);

	}
	public Node input(Node h,int x) {
		Node nNode=new Node(x);
		if(h!=null) {
			nNode.next=h;
		}
		h=nNode;
		return h;
	}
	 public void print(Node h) {
		 if(h==null) {
			 return;
		 }
		 else {
			 Node temp=h;
			 while(temp!=null) {
				 System.out.print(temp.val+" ");
				 temp=temp.next;
			 }
		 }
	 }
	  public Node makingCirculer(Node h) {
		  Node temp1=h.next.next;
		  Node temp2=h;
		  while(temp2.next!=null) {
			  temp2=temp2.next;
		  }
		  temp2.next=temp1;
		  return h;
	  }
	  
	  public boolean detectAndRemoveLoop(Node h) {
		  Node pre=h;
		  Node slow=h.next;
		  Node fast=h.next;
		  while(fast!=null) {
			  h=h.next;
			  slow=slow.next;
			  fast=fast.next;
			  if(slow==fast) {
				  h.next=null;
				  return true;
			  }
		  }
		  return false;
	  }
	  
	  public Node removeOddPos(Node head) {
			Node H=null;
			Node T=null;
			int count=0;
			Node x=null;
			while(head!=null && head.next!=null) {
				if(count%2==0) {
					x=head.next;
					head=head.next;
					
				}
				else {
					x=head.next.next;
					head=head.next.next;
					
				}
				count++;
				if(H==null) {
					H=x;
					T=x;
				}
				else {
					T.next=x;
					T=x;
				}
			}
			return H;
}
}
