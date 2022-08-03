package jul31;
class Node{
	int x;
	Node next;
	Node(int x){
		this.x=x;
	}
}
class Mocdata{
	Node head;
	
	public Node add(int x) {
		Node nNode=new Node(x);
		if(this.head==null) {
			this.head=nNode;
		}
		else {
			nNode.next=this.head;
			this.head=nNode;
		}
		return head;
	}
	
	public void print(Node N) {
		if(!isEmpty()) {
			while(N!=null) {
				System.out.print(N.x+" ");
				N=N.next;
			}
		}
		else {
			System.out.println("Empty Node");
		}
		
	}
	public boolean isEmpty() {
		if(this.head==null) {
			return true;
		}
		return false;
	}
	public void remove() {
		if(!isEmpty()) {
			this.head=this.head.next;
		}
		else {
			System.out.println("Node is Empty");
		}
	}
	
	
	public Node reverse() {
		Node cur=this.head;
		Node pre=null;
		while(cur!=null) {
			Node temp=cur.next;
			cur.next=pre;
			pre=cur;
			cur=temp;
		}
		return pre;
	}

	
}

public class Moc {
	public static void main(String[] args) {
		Mocdata mm=new Mocdata();
		for(int i=0;i<10;i++) {
			mm.add(i);
		}
		mm.print(mm.head);
		System.out.println();
		Node hh=mm.reverse();
		mm.add(20);
		mm.print(hh);
		System.out.println();
		mm.print(mm.head);
		
				
	}

}
