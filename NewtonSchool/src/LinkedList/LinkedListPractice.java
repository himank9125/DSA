package LinkedList;

import java.util.Scanner;

class NodeTypeLL{
	int data;
	NodeTypeLL next;
	NodeTypeLL(int data){
		this.data=data;
	}
	
}

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeTypeLL var=inputFun();
		printResult(var);
	}
	public static NodeTypeLL inputFun() {
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		NodeTypeLL head=null;
		NodeTypeLL tail=null;
		while(data!=-1) {
			NodeTypeLL nodeObj=new NodeTypeLL(data);
			if(head==null) {
				head=nodeObj;
				tail=nodeObj;
			}
			else {
				tail.next=nodeObj;
				tail=nodeObj;
				
			}
			data=sc.nextInt();
		}
		return head;		
	}
	public static void printResult(NodeTypeLL a) {
		while(a!=null) {
			System.out.print(a.data+" ");
			a=a.next;
		}
	}

}
