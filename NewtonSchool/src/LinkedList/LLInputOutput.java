package LinkedList;

import java.util.Scanner;

class MyLL{
	int data;
	MyLL next;
	MyLL(int data){
		this.data=data;
	}
}
public class LLInputOutput {

	public static void main(String[] args) {
		MyLL res=inputLL();
		printLL(res);
		// TODO Auto-generated method stub

	}
	public static MyLL inputLL() {
		Scanner sc=new Scanner(System.in);
		int elm=sc.nextInt();
		MyLL head=null;
		MyLL tail=null;
		while(elm!=-1) {
			MyLL llObj=new MyLL(elm);
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
	public static void printLL(MyLL A) {
		while(A!=null) {
			System.out.print(A.data+" ");
			A=A.next;
		}
	}

}
