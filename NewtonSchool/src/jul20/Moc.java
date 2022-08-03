package jul20;

import java.util.Scanner;

class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}

public class Moc {
	Node head;
	public Node add(int data) {
		Node nNode=new Node(data);
		if (this.head!=null) {
			nNode.next=this.head;
		}
		this.head=nNode;
		return this.head;
	}
	public Node insertInOneShot() {
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		while(data!=-1) {
			Node nNode=new Node(data);
			if(this.head!=null) {
				nNode.next=head;
			}
			head=nNode;
			data=sc.nextInt();
		}
		return head;
	}
	public void print(Node N) {
		Node temp=N;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
	}
	public boolean palendrome(Node N) {
		Node slow=N;
		Node fast=N;
		Node reverse=null;
		while(fast!=null && fast.next!=null) {
			Node temp=slow.next;
			fast=fast.next.next;
			slow.next=reverse;
			reverse=slow;
			slow=temp;
		}
		if(fast!=null) {
			slow=slow.next;
		}
		while(reverse!=null) {
			if(slow.val!=reverse.val) {
				return false;
			}
			slow=slow.next;
			reverse=reverse.next;
		}
		return true;
	}
	

	public static void main(String[] args) {
		Moc myObj=new Moc();
//		myObj.add(0);
//		myObj.add(1);
//		myObj.add(2);
//		myObj.add(3);
//		myObj.add(4);
//		myObj.add(2);
//		myObj.add(1);
//		myObj.add(0);
		myObj.insertInOneShot();
		myObj.print(myObj.head);
		System.out.println();
		System.out.println(myObj.palendrome(myObj.head));
		
	}
	
}
