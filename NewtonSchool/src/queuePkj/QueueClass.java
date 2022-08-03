package queuePkj;
class QueueLL{
	int value;
	QueueLL next;
	QueueLL(int value){
		this.value=value;
	}
}

public class QueueClass {

	QueueLL head= null;
	QueueLL tail=null;
	int count;
	
	public void add(int el) {
		QueueLL queObj=new QueueLL(el);
		if(this.head==null) {
			this.head=queObj;
			this.tail=queObj;
		}
		else {
			this.tail.next=queObj;
			this.tail=queObj;
		}
		System.out.println("The new inserted element is "+el);
		this.count++;
	}
	
	public void poll() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			System.out.println("Removed element is "+head.value);
		this.head=this.head.next;
		this.count--;
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
		System.out.println("The Peek element is "+this.head.value);
		}
	}
	
	public boolean isEmpty() {
		if(this.head==null) {
			return true;
		}
		return false;
	}
	
	public int size() {
		System.out.println("Size of queue is "+this.count);
		return this.count;
	}
	

	public static void main(String[] args) {
		
	}

}
