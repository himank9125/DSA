package collections;

import java.util.ArrayDeque;

public class MyArrayDeque {

	public static void main(String[] args) {
		
		/*
		 * offer----> Insert Value;
		 * poll-----> remove value;
		 * peek---------> value on top
		 * 
		 *-----Operations From Start-------------------------------
		 * 
		 * offerFirst----> Insert value;
		 * pollFirst-----> remove value;
		 * peekFirst---------> value on top
		 * 
		 * ----------Operations From End--------------------------------
		 * 
		 * offerLast----> Insert Value;
		 * pollLast-----> remove value;
		 * peekLast---------> value on top
		 * 
		 */
		// TODO Auto-generated method stub
		ArrayDeque<Integer> aq=new ArrayDeque<>();
		aq.offer(10);
		aq.offerFirst(20);
		aq.offerLast(5);

	}

}
