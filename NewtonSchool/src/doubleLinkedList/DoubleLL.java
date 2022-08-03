package doubleLinkedList;

import java.util.Scanner;

class DoubleL{
	int value;
	DoubleL next;
	DoubleL pre;
	DoubleL(int value){
		this.value=value;
	}
}

public class DoubleLL {

	public static void main(String[] args) {
		DoubleL el=input();
		printLL(el);
		
	}
	static DoubleL input() {
		Scanner sc=new Scanner(System.in);
		int elm=sc.nextInt();
		DoubleL head=null;
		DoubleL tail=null;
		while(elm!=-1) {
			DoubleL dlObj= new DoubleL(elm);
			if(head==null) {
				head=dlObj;
				tail=dlObj;
				head.pre=null;
			}
			else {
				DoubleL temp=tail;
				temp.next=dlObj;
				tail=dlObj;
				tail.pre=temp;
			}
			elm=sc.nextInt();
		}
		return head;
	}
	static void printLL(DoubleL x) {
		while(x!=null)
		{
			System.out.println("The Current Element is "+x.value);
			if(x.pre!=null && x.next!=null)
			{
				System.out.println("Pre of current element is "+x.pre.value);
				System.out.println("Next of current element is "+x.next.value);
			}
		
		
		System.out.println("*************************************************");
		x=x.next;
		}
	}

}
