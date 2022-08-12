package priorityQueuePRC;

import java.util.*;

public class Priority {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=6;i>0;i--) {
			pq.add(i);
			//pq.add(1);
		}
		System.out.println(pq);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		

	}

}
