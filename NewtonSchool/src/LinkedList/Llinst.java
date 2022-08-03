package LinkedList;

import java.util.Scanner;

class LLNode {

    int data;
    LLNode next;

    LLNode(int data) {
        this.data = data;
    }

}

public class Llinst {

	public static void main(String[] args) {
		 LLNode head = takeInput();
	        print(head);
	    }
	    public static LLNode takeInput() {
	        Scanner s = new Scanner(System.in);
	        int data = s.nextInt();
	        LLNode head = null; 
	        LLNode tail = null; 
	        while (data != -1) {
	            LLNode newNode = new LLNode(data);
	            if (head == null) {
	                head = newNode;
	                tail = newNode;
	            } else {
	                tail.next = newNode;
	                tail = newNode; 
	            }
	           data = s.nextInt();
	        }
	        return head;
	    }
	    public static void print(LLNode head) {
	        LLNode temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + "---->"+temp.next+" ,");
	            temp = temp.next;
	        }

	}

}
