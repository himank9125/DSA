package queuePkj;

import java.util.Scanner;

public class SwitchDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//QueueClass qobj= new QueueClass();
		QueueArray qobj=new QueueArray();
		while(a!=0) {
			switch(a) {
			case 1: qobj.add(sc.nextInt()); break;
			case 2: qobj.poll(); break;
			case 3: qobj.peek(); break;
			case 4: qobj.size(); break;
			case 5: System.out.println(qobj.isEmpty()); break;
			default: System.out.println("Please Enter the valid key(0-5)");
			}
			a=sc.nextInt();
		}

	}

}
