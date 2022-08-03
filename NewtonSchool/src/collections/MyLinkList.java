package collections;

import java.util.LinkedList;
import java.util.Queue;

public class MyLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * offer----> Insert Value;
		 * poll-----> remove value;
		 * peek---------> value on top
		 * 
		 * Exceptional Functions
		 * add()----------->Returns exception if "offer" not possible.
		 * remove()-------->Returns exception if "poll" not possible.
		 * element()------->Returns exception if "peek" not possible.
		 */
		
//		Queue<Integer> que=new LinkedList<>();
//		que.offer(20);
//		que.offer(30);
//		que.offer(40);
//		System.out.println(que);
//		System.out.println(que.poll());
//		System.out.println(que.peek());
		
		Queue<String> animal=new LinkedList<>();
		animal.offer("cat");
		System.out.println(animal.peek());
		animal.poll();
		System.out.println(animal.peek());
		//System.out.println(animal.element());  //-----------------Generating Error
		

	}

}
