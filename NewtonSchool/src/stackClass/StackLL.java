package stackClass;
class Stack{
	int value;
	Stack next;
	Stack(int value){
		this.value=value;
	}
}
//---------------------------------------------------------------------------------------------

public class StackLL {
	private Stack head;
	private int count;
	
	public void push(int elm) {
		Stack StObj=new Stack(elm);
		StObj.next=this.head;
		this.head=StObj;
		System.out.println("Pushed element = "+this.head.value);
		this.count++;
	}
	
	public void peek() {
		if(this.head==null) {
			System.out.println("Stack is Empty");
		}
		else {
		System.out.println(head.value);
		}
	}
	
	public Stack pop() {
		if(this.head==null){
			System.out.println("Stack is Empty");
			return null;
		}
		System.out.println(this.head.value);
		this.head=this.head.next;
		this.count--;
		return head;
	}
	
	public void stackSize() {
		if(count<=0) {
			System.out.println("Stack is empty");
		}
		System.out.println(this.count);
	}
	
	public boolean isEmpty() {
		return(this.count==0);
	}
	
	
	

//	public static void main(String[] args) {
//		
//
//	}

}
