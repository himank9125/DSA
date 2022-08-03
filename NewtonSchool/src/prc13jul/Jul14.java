package prc13jul;
class Ln{
	int val;
	Ln next;
	Ln(int val){
	this.val=val;	
	}
}

public class Jul14 {
	Ln head;

	public static void main(String[] args) {
		Jul14 jj=new Jul14();
		
		jj.insertAtFirst(1);
		jj.insertAtFirst(2);
		jj.insertAtFirst(3);
		jj.insertAtFirst(4);
		jj.insertAtFirst(5);
		jj.insertAtFirst(6);
		jj.insertAtFirst(7);
		jj.insertAtFirst(8);
		jj.insertAtFirst(9);
		jj.insertAtFirst(10);
		jj.insertAtFirst(11);
		jj.insertAtFirst(12);
//		jj.insertAtend(13);
//		jj.insertAtend(14);
		
		System.out.println("Before doing idx insertion");
		jj.print(jj.head);
		System.out.println();
		Ln x=jj.insertAtidx(6, 99, jj.head);
		System.out.println("After doing idx insertion ");
		jj.print(x);
		System.out.println();
		
		
		System.out.println();
//		Ln ab=jj.reverse(jj.head);
//		jj.print(ab);
		System.out.println();
//		System.out.println(jj.mid(jj.head));
		Ln mid=jj.mid(jj.head);
		int midelmt=mid.val;
		System.out.println("The middil Element is "+midelmt);
		Ln cir=jj.circuler(jj.head, jj.mid(jj.head));
//		jj.print(cir);
		System.out.println(jj.checkCirculer(jj.head));
		System.out.println("The Rotatory Point is "+jj.rotateryPoint(cir));
	}
	public Ln insertAtFirst(int x) {
		Ln Lobj=new Ln(x);
		if(this.head!=null) {
			Lobj.next=this.head;	
		}
		this.head=Lobj;
		return this.head;
	}
	public void print(Ln node) {
		Ln temp=node;
		if(node==null) {
			System.out.print("The Linked List is Empty");
		}
		else {
			while(temp!=null) {
				System.out.print(temp.val+" ");
				temp=temp.next;
			}
		}
	}
	public Ln reverse(Ln node) {
		Ln prev=null;
		Ln cur=node;
		while(cur!=null) {
			Ln temp=cur.next;
			cur.next=prev;
			prev=cur;
			cur=temp;
		}
		return prev;
	}
	public Ln mid(Ln node) {
		Ln slow=node;
		Ln fast=node;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public Ln circuler(Ln node, Ln mid) {
		Ln temp=node;
		while(temp!=null && temp.next!=null) {
			temp=temp.next;
		}
		temp.next=mid;
		return node;
	}
	public boolean checkCirculer(Ln node) {
		Ln slow=node;
		Ln fast=node;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	public int rotateryPoint(Ln node) {
		Ln start=node;
		Ln slow=node;
		Ln fast=node;
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				break;
			}
		}
		while(fast!=null) {
			if(fast==start) {
				break;
			}
			else {
				fast=fast.next;
				start=start.next;
			}
		}
		return start.val;
	}
	public void insertAtend(int x) {
		Ln lobj=new Ln(x);
		if(this.head==null) {
			head=lobj;
		}
		else {
			Ln temp=head;
			while(temp!=null && temp.next!=null) {
				temp=temp.next;
			}
			temp.next=lobj;
		}
	}
	public Ln insertAtidx(int idx, int data, Ln node) {
		Ln temp=node;
		Ln lObj=new Ln(data);
		if(idx==1) {
			lObj.next=node;
			node=lObj;
			return node;
		}
		while(temp.next!=null && idx>2) {
			temp=temp.next;
			idx--;
		}
		if(idx==2) {
			Ln temp1=temp.next;
			temp.next=lObj;
			lObj.next=temp1;			
		}
		else {
			System.out.print("Given Index Out of Linked List");
		}
		return node;
	}

}
