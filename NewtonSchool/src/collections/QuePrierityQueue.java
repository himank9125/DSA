package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QuePrierityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * PriorityQueue -----------Returns priority value, (by default it is set as "MIN Value")
		 * 
		 */
		Queue<Integer> qe=new PriorityQueue<>();
		qe.offer(20);
		qe.offer(100);
		qe.offer(50);
		qe.offer(10);
		qe.offer(90);
		System.out.println(qe);
		System.out.println(qe.peek());
		
		
		// Change the priority to MAX using Comparator}
		Queue<Integer> qs=new PriorityQueue<>(Comparator.reverseOrder());
		qs.offer(6);
		qs.offer(10);
		qs.offer(50);
		qs.offer(11);
		qs.offer(9);
		System.out.println(qs);
		System.out.println(qs.peek());
		
		
		
		

	}

}
