package stackClass;

public class StackDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StackLL stObj= new StackLL();
		StackArray stObj=new StackArray();
		stObj.push(10);
		stObj.push(9);
		stObj.push(8);
		stObj.push(7);
		stObj.push(6);
		stObj.pop();
		stObj.pop();
		stObj.pop();
		stObj.pop();
		stObj.stackSize();
		stObj.push(6);
		stObj.push(3);
		stObj.stackSize();
		stObj.peek();
		System.out.print(stObj.isEmpty());
		

	}

}
