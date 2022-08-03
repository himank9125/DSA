package jul31;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListandStack {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		for(int i=0;i<5;i++) {
			list.add(i);
		}
		System.out.println("This is a list "+list);
		Stack<Integer> stk=new Stack<>();
//		while(!list.isEmpty()) {
//			stk.push(list.peek());
//			list.remove();
//		}
		for(int i=0;i<5;i++) {
			stk.push(i);
		}
		System.out.println(list.peek());
		System.out.println(stk.peek());
		System.out.println("This is Stack "+stk);
		

	}

}
