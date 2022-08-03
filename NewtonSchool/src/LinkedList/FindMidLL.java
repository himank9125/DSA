package LinkedList;

import java.util.Scanner;

class LLclass{
	int data;
	LLclass next;
	LLclass(int data){
		this.data=data;
	}
}

public class FindMidLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLclass var=inputLL();
		printLL(var);
		System.out.println();
		System.out.print(midElement(var));
		

	}
	
	public static LLclass inputLL() {
		Scanner sc=new Scanner(System.in);
		int elm=sc.nextInt();
		LLclass head=null;
		LLclass tail=null;
		while(elm!=-1) {
			LLclass llObj=new LLclass(elm);
			if(head==null) {
				head=llObj;
				tail=llObj;
			}
			else {
				tail.next=llObj;
				tail=llObj;
			}
			elm=sc.nextInt();
		}
		return head;
	}
	public static void printLL(LLclass A) {
		while(A!=null) {
			System.out.print(A.data+" ");
			A=A.next;
		}
	}
	public static int midElement(LLclass node) {
		LLclass cur=node;
		LLclass fast=node;
		while(fast!=null && fast.next!=null) {
			cur=cur.next;
			fast=fast.next.next;
		}
		return cur.data;
	}

}
