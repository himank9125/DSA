package prc06July2022;

import java.util.Scanner;

class Node{
	int x;
	Node next;
	Node prev;
	public Node(int x) {
		this.x=x;
	}
}

public class LinkedListt {

	public static void main(String[] args) {
//		Node result=LinkedInput();
//		printLinked(result);
		System.out.println("******************");
		Node res =doubleLlInput();
		printDLL(res);
		
		
		

	}
	static Node LinkedInput() {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Node head=null;
		Node tail=null;
		while(x!=0) {
			Node nodeObj=new Node(x);
			if(head==null) {
				head=nodeObj;
				tail=nodeObj;
			}
			else {
				tail.next=nodeObj;
				tail=nodeObj;
			}
			x=sc.nextInt();
		}
		return head;
	}
	static void printLinked(Node n) {
		while(n!=null) {
			System.out.print(n.x+"-->");
			n=n.next;
		}
	}
	static Node doubleLlInput() {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Node head=null;
		Node tail=null;
		while(x!=0) {
			Node dlObj=new Node(x);
			if(head==null) {
				head=dlObj;				
			}
			else {
				tail.next=dlObj;
				dlObj.prev=tail;
			}
			tail=dlObj;
			x=sc.nextInt();
		}
		return head;
	}
	static void printDLL(Node dd) {
		
		while(dd!=null) {
		System.out.print(dd.x+".next ");
		dd=dd.next;
		if(dd!=null) {
		System.out.print(dd.prev.x+".prev ");
		}
		
		}		
	}

}
