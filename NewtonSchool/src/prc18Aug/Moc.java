package prc18Aug;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class Moc {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Moc nodeObj=new Moc();
		Node head=null;
		for(int i=0;i<5;i++) {
			int x=sc.nextInt();
			head=nodeObj.input(head,x);
		}
		nodeObj.printLL(head);
		System.out.println();
		Node N=nodeObj.reverseLL(head);
		nodeObj.printLL(N);
		

	}
	public Node input(Node h,int x) {
		Node nNode=new Node(x);
		if(h!=null) {
			nNode.next=h;
		}
		h=nNode;
		return h;
	}
	
	public void printLL(Node h) {
		if(h==null) {
			return;
		}
		Node temp=h;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public Node reverseLL(Node h) {
		Node cur=h;
		Node rev=null;
		while(cur!=null) {
			Node temp=cur.next;
			cur.next=rev;
			rev=cur;
			cur=temp;
		}
		return rev;
	}
	public Node deleteVal(Node h,int x) {
		if(h.data==x) {
			return h.next;
		}
		Node temp=h;
		Node temp2=h.next;
		while(temp2!=null) {
			if(temp2.data==x) {
				temp.next=temp2.next;
				return temp;
			}
			temp2=temp2.next;
			temp=temp.next;
		}
		return h;
	}

}
