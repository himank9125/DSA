package queuePkj;

public class QueueDriver {

	public static void main(String[] args) {
		QueueClass qobj= new QueueClass();
		qobj.add(10);
		qobj.add(3);
		qobj.add(5);
		qobj.add(9);
		qobj.size();
		qobj.peek();
		qobj.poll();
		qobj.size();
		qobj.poll();
		qobj.poll();
		qobj.peek();
		qobj.add(12);
		qobj.peek();
		System.out.println(qobj.isEmpty());		
	}

}
