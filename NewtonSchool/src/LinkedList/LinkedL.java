package LinkedList;

import java.util.Scanner;
class NodeLL{
	int value;
	NodeLL next;
	
	NodeLL(int value) {
		this.value=value;
	}
}



public class LinkedL {

	public static void main(String[] args) {
		NodeLL var=inputLL();
		printLL(var);
			
	}
	public static NodeLL inputLL() {
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		NodeLL head=null;
		NodeLL tail=null;
		while(val!=-1) {
			NodeLL objLL=new NodeLL(val);
			if(head==null) {
				head=objLL;
				tail=objLL;
			}
			else {
				tail.next=objLL;
				tail=objLL;
			}
			val=sc.nextInt();
		}
		return head;
	}
	public static void printLL(NodeLL data) {
		while(data!=null) {			
			System.out.print(data.value+" ");
			data=data.next;
		}
	}

}



