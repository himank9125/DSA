package LinkedList;

import java.util.Scanner;
class InsLL{
	int data;
	InsLL next;
	InsLL(int data){
		this.data=data;
	}
}

public class InsertLL {

	public static void main(String[] args) {
		InsLL res=inputLL();
		printLL(res);
		System.out.println();
		InsLL res2= insertLL(res,9,6);
		printLL(res2);
		// TODO Auto-generated method stub

	}
	public static InsLL inputLL() {
		Scanner sc=new Scanner(System.in);
		int elm=sc.nextInt();
		InsLL head=null;
		InsLL tail=null;
		while(elm!=-1) {
			InsLL llObj=new InsLL(elm);
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
	public static void printLL(InsLL A) {
		while(A!=null) {
			System.out.print(A.data+" ");
			A=A.next;
		}
	}
	public static InsLL insertLL(InsLL hs, int a, int idx) {
		if(idx==0) {
			InsLL myLLObj=new InsLL(a);
			myLLObj.next=hs;
			hs=myLLObj;
			return hs;
		}
		else {
			InsLL cur=hs;
			while(idx-->2) {
				cur=cur.next;
			}
			InsLL myLLObj=new InsLL(a);
			InsLL nextNode=cur.next;
			cur.next=myLLObj;
			myLLObj.next=nextNode;
			return hs;
		}
	}


}

