package stackClass;
class StackArr{
	int value;
	StackArr next;
}

public class StackArray {	
	int[] arr;
	int count;
	public StackArray() {
		this.arr=new int[5];
	}
	
	public void push(int elm) {
		if(this.count>=this.arr.length-1) {
			resizeFun();
		}
		else {
			this.arr[count]=elm;
			System.out.println(elm+" has been pushed");
			count++;
		}
	}
	
	private void resizeFun() {
		int[] oldArr=this.arr;
		this.arr=new int[oldArr.length+(oldArr.length/2)];
		for(int i=0;i<oldArr.length;i++) {
			this.arr[i]=oldArr[i];
		}
	}
	public void peek() {
		if(this.count<0) {
			System.out.println("Stack is Empty");
		}
		System.out.println(this.count-1);
	}
	public void pop() {
		if(this.count<0) {
			System.out.println("Stack is Empty");
		}
		System.out.println(this.arr[this.count]+" has been poped");
		this.count--;
	}
	public void stackSize() {
		if(this.count<0) {
			System.out.println("Stack is Empty");
		}
		System.out.println(this.count);
	}
	public boolean isEmpty() {
		return(this.count==0);
	}
	
	

	public static void main(String[] args) {
		

	}

}
