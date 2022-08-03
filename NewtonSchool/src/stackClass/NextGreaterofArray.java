package stackClass;
import java.util.*;
import java.util.Stack;


public class NextGreaterofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,7,4,1,9};
		int[] result=nextGrElement(arr);
		for(int i:result) {
			System.out.print(i+" ");
		}

	}
	static int[] nextGrElement(int[] A) {
		int[] B=new int[A.length];
		for(int i=0;i<B.length;i++) {
			B[i]=-1;
		}
		Stack<Integer> stk=new Stack<>();
		stk.push(0);
		
		for(int i=1;i<A.length;i++) {
			while(!stk.isEmpty() && A[stk.peek()]<A[i]) {
				B[stk.peek()]=A[i];
				stk.pop();
			}
			stk.push(i);
		}
		return B;
	}
}
