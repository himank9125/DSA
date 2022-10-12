package LinkedList;

import java.util.Scanner;

class LLRevers{
	int value;
	LLRevers next;
	LLRevers(int value){
		this.value=value;
	}
}

public class ReverseLL {

	public static void main(String[] args) {
		LLRevers res=inputLL();
		printLL(res);
		System.out.println();
		LLRevers res2= reverseLink(res);
		printLL(res2);
		
		
		// TODO Auto-generated method stub

	}
	public static LLRevers inputLL() {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		LLRevers head=null;
		LLRevers tail=null;
		while(num!=9) {
			LLRevers LLobj= new LLRevers(num);
			if(head==null) {
				head=LLobj;
				tail=LLobj;
			}
			else {
				tail.next=LLobj;
				tail=LLobj;
			}
			num=sc.nextInt();
		}
		return head;
	}
	
	
	public static void printLL(LLRevers node) {
		while(node!=null) {
			System.out.print(node.value+" ");
			node=node.next;
		}
	}
	public static LLRevers reverseLink(LLRevers node) {
		LLRevers pre=null;
		LLRevers cur=node;
		while(cur!=null) {
			LLRevers temp=cur.next;
			cur.next=pre;
			pre=cur;
			cur=temp;
			
		}
		return pre;
	}

}
