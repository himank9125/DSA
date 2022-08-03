package prcJul19;
class Nodee{
	int data;
	Nodee next;
	Nodee(int data){
	this.data=data;	
	}
}

public class Rotall {
	Nodee head;
	public Nodee add(int x) {
		Nodee newnode=new Nodee(x);
		if(this.head==null) {
			this.head=newnode;
		}
		else {
			newnode.next=this.head;
			this.head=newnode;
		}
		return this.head;
	}
	public void print() {
		Nodee temp=this.head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public Nodee rotate(int k) {
		
		while(k-->0) {
			Nodee temp=this.head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			Nodee temp2=temp.next;
			temp.next=null;
			temp2.next=this.head;
			this.head=temp2;
			
		}
		return head;
	}
	
	public static void main(String[] args) {
		Rotall rr=new Rotall();
		rr.add(1);
		rr.add(2);
		rr.add(3);
		rr.add(4);
		rr.add(5);
		rr.add(6);
		rr.add(7);
		rr.add(8);
		rr.add(9);
		rr.print();
		System.out.println();
		rr.rotate(3);
		rr.print();

	}

}
