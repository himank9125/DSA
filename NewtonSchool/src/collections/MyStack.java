package collections;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * push----> Insert Value;
		 * pop-----> remove value;
		 * peek---------> value on top
		 * 
		 */
		Stack<Integer> st=new Stack<>();
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		System.out.println(st);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st);

	}

}
