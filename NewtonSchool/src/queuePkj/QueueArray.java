package queuePkj;

public class QueueArray {
	int[] arr=new int[5];
	int count;
	
	
	public void add(int elm) {
		if(this.arr.length<=this.count) {
			increaseSize(this.arr);
		}
		else {
		this.arr[count]=elm;
		System.out.println("The inserted Element is "+elm);
		this.count++;
		}
	}
	public void increaseSize(int[] arr) {
		int[] tempArr=new int[arr.length+(arr.length/2)];
		for(int i=0;i<arr.length;i++) {
			tempArr[i]=arr[i];
		}
		arr=tempArr;
	}
	public void poll() {
		if(!isEmpty()) {
		System.out.println("Removed element is "+this.arr[0]);
		for(int i=0;i<this.count;i++) {
			this.arr[i]=this.arr[i+1];
		}
		this.count--;
		}
		else {
			System.out.println("The queue is empty");
		}
	}
	
	public void peek() {
		if(!isEmpty()) {
			System.out.println("Peek element is "+this.arr[0]);
		}
		else {
			System.out.println("The queue is empty");
		}
		
	}
	
	public boolean isEmpty() {
		if(this.count==0) {
			return true;
		}
		return false;
	}
	
	public void size() {
		System.out.println("The size of Queue is "+this.count);
	}
	
	
	
	
	public static void main(String[] args) {
		

	}

}
