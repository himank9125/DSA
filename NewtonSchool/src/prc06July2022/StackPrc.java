package prc06July2022;
class Stk{
	int value;
	Stk next;
	public Stk(int value) {
		this.value=value;
	}
}

public class StackPrc {
	Stk head=null;
	Stk tail=null;
	int count;

	public static void main(String[] args) {
		StackPrc obj=new StackPrc();
		obj.push(10);
		obj.push(5);
		obj.push(6);
		obj.push(3);
		obj.push(2);
		obj.peek();
		obj.size();
		obj.pop();
		obj.peek();
		obj.size();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.size();
		

	}
	public void push(int x) {
		Stk stkObj=new Stk(x);
		if(this.head==null) {
			this.tail=stkObj;
		}
		else {
			stkObj.next=this.head;
		}
		this.head=stkObj;
		System.out.println(this.head.value+" has been pushed");
		this.count++;
		
	}
	public boolean isEmpty() {
		if(count<=0) {
			return true;
		}
		return false;
	}
	public void peek() {
		if(!isEmpty()) {
		System.out.println(this.head.value+" is the peek element");
		}
		else {
			System.out.println("Stack is Empty");
		}
	}
	public void pop() {
		if(!isEmpty()) {
			System.out.println(this.head.value+" has been Poped");
			this.head=head.next;
			count--;
		}
		else {
			System.out.println("Stack is Empty");
		}
	}
	public void size() {
		if(!isEmpty()) {
			System.out.println(this.count+" is the size of stack");
		}
		else {
			System.out.println("Stack is Empty");
		}
	}

}
