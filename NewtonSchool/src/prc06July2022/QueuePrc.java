package prc06July2022;
class Queue{
	int value;
	Queue next;
	Queue(int x){
		this.value=x;
	}
}

public class QueuePrc {
	Queue head=null;
	Queue tail=null;
	int count;
	

	public static void main(String[] args) {
		QueuePrc obj=new QueuePrc();
		obj.put(10);
		obj.put(5);
		obj.put(6);
		obj.put(3);
		obj.put(2);
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
		
	}
	
	
	
	
	public void put(int x) {
		Queue qObj=new Queue(x);
		if(this.head==null) {
			head=qObj;		
		}
		else {
			tail.next=qObj;
		}
		System.out.println(x+" has been inserted");
		tail=qObj;
		count++;
	}
	public void peek() {
		if(!isEmpty()) {
		System.out.println(this.head.value+" is on peek");
		}
		else {
			System.out.println("Queue is Empty");
		}
	}
	public void pop() {
		if(!isEmpty()) {
		System.out.println(this.head.value+" has been poped");
		this.head=this.head.next;
		this.count--;
		}
		else {
			System.out.println("Queue is Empty");
		}
	}
	 public boolean isEmpty() {
		 if(count<=0) {
			 return true;
		 }
		 return false;
	 }
	 public void size() {
		 System.out.println(this.count+" is the size of Queue");
	 }

}
