package prcJul19;
class Nod{
	int data;
	Nod next;
	Nod(int data){
		this.data=data;
	}
}

public class Moc {
	Nod head;
	Nod head2;
	public Nod add(int x) {
		Nod nNode=new Nod(x);
		if(this.head!=null) {
			nNode.next=this.head;
		}
		this.head=nNode;
		return head;
	}
	public void print(Nod temp) {
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	public void reverse(Nod temp) {
		while(temp!=null) {
			Nod temp2=temp.next;
			temp.next=this.head2;
			this.head2=temp;
			temp=temp2;
		}
	}
	
	public boolean checkPalendrome(Nod h1, Nod h2) {
		Nod temp1=h1;
		Nod temp2=h2;
		while(temp1.next!=null && temp2.next!=null) {
			if(temp1.data!=temp2.data) {
				return false;
			}
			temp1=temp1.next;
			temp2=temp2.next;
		}
		return true;
	}
	public Nod mid(Nod head) {
		Nod fast=head;
		Nod slow=head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
	public boolean palen(Nod head) {
		
		while(head!=mid(head)) {
			Nod temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			if(head.data==temp.next.data) {
				head=head.next;
				temp.next=null;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Moc mm=new Moc();
		mm.add(1);
		mm.add(1);
		mm.add(2);
		mm.add(0);
		mm.add(2);
		mm.add(1);
		mm.add(1);
//		mm.print(mm.head);
//		Nod hs=mm.head;
//		mm.reverse(hs);
//		System.out.println("head2");
//		mm.print(mm.head);
//		System.out.println("head");
//		mm.print(mm.head);
		System.out.println(mm.palen(mm.head));
		System.out.println(mm.mid(mm.head).data);
		//System.out.println(mm.checkPalendrome(head2, mm.head));
		
		//mm.checkPalendrome(head2, mm.head);
		

	}

}
