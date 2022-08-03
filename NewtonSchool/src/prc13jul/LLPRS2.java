package prc13jul;
class LLSarang{
	int val;
	LLSarang next;
	LLSarang(int val){
		this.val=val;
	}
}

public class LLPRS2 {
	LLSarang head;
	public static void main(String [] args) {
		LLPRS2 obj=new LLPRS2();
		obj.insertAtInning(5);
		obj.insertAtInning(3);
		obj.insertAtInning(9);
		obj.insertAtInning(7);
		obj.insertAtInning(6);
		obj.print();
		
	}
	
//	head.next=something=====> Assigning the address of next element in the current head.
//	someting =head.next===>> Node traversing...
	
	
	public LLSarang insertAtInning(int data) {
		LLSarang newObj= new LLSarang(data);
		if(this.head==null) {
			this.head=newObj;
		}
		else {
			newObj.next=this.head;
			this.head=newObj;
		}
		return this.head;
	}
	public void print() {
		LLSarang temp=this.head;
		while(temp!=null) {
			System.out.print(temp.val+"<----");
			temp=temp.next;
		}
	}
	

}
