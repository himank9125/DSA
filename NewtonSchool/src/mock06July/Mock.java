package mock06July;

import java.util.Scanner;

class Node{
	int x;
	Node next;
	Node(int x) {
		this.x=x;
	}
}

public class Mock {
	Node head=null;
	Node tail=null;
	int count;
	public static void main(String[] args) {
		 Mock mObj=new Mock();
		 Node res=mObj.inputLL();
		 mObj.print(res);
		 mObj.insertAt(3,45);
		 mObj.print(res);
		
	}
	
	public Node inputLL() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a!=-1) {
			Node nObj=new Node(a);
			if(head==null) {
				head=nObj;
			}
			else {
				tail.next=nObj;
			}
			tail=nObj;
			a=sc.nextInt();
			count++;
		}
		return head;
	}
	
	public void insertAt(int idx, int el) {
		
		while(count!=idx) {
			head=head.next;
			count--;
		}
		Node nObj=new Node(el);
		Node temp=head.next;
		head.next=nObj;
		nObj.next=temp;
		
	}
	public void print(Node nn) {
		while(nn!=null) {
		System.out.print(nn.x+" ");
		nn=nn.next;
		}
	}

}
