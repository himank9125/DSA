package prcJul19;
class Node<T>{
	T data;
	Node<T> next;
	public Node(T data) {
		this.data=data;
	}
}

public class QueueCl<T> {
	Node<T> head;
	Node<T> tail;
	public QueueCl(){
		this.head=null;
		this.tail=null;
	}
	
	public boolean isEmpty() {
		if(this.head==null) {
			return true;
		}
		return false;
	}
	
	public Node<T> push(T elm) {
		Node<T> newNode= new Node<T>(elm);
		if(isEmpty()) {
			this.head=newNode;	
		}
		else {
			this.tail.next=newNode;
		}
		this.tail=newNode;
		return this.head;
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			Node<T> temp=this.head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	
	
	

	public static void main(String[] args) {
		QueueCl<String> qobj=new QueueCl<String>();
		qobj.push("mayank");
		qobj.push("Naveen");
		qobj.push("Radhika");
		qobj.push("Mridul");
		qobj.push("Ritika");
		qobj.push("Manoj");
		qobj.push("Mamta");
		qobj.print();
		System.out.println();
		qobj.print();
	}

}
