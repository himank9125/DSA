package LinkedList;
import java.util.Scanner;

class LLreverseK{
	int value;
	LLreverseK next;
	LLreverseK(int value){
		this.value=value;
	}
}

public class ReverseKelmLL {

	public static void main(String[] args) {
		LLreverseK res=inputLL();
		printLL(res);
		System.out.println();
		LLreverseK res2= reverseLinkbyK(res,3);
		printLL(res2);
	}
	public static LLreverseK inputLL() {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		LLreverseK head=null;
		LLreverseK tail=null;
		while(num!=9) {
			LLreverseK LLobj= new LLreverseK(num);
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
	public static void printLL(LLreverseK node) {
		while(node!=null) {
			System.out.print(node.value+" ");
			node=node.next;
		}
	}
	
	
	public static LLreverseK reverseLinkbyK(LLreverseK node, int k) {
		if(node==null || node.next==null) {
			return node;
		}
		LLreverseK pre=null;
		LLreverseK cur=node;
		int x=k;
		while(x-->0 && cur!=null) {
			LLreverseK temp=cur.next;
			cur.next=pre;
			pre=cur;
			cur=temp;			
		}
		//System.out.println("This is cur "+cur.value+" This is cur");
		LLreverseK remainingElm=reverseLinkbyK(cur,k);
		if(node!=null) {
			node.next=remainingElm;
		}
		return pre;
	}

	
}


