package stackClass;

import java.util.Scanner;
import java.util.Stack;


public class Bracketproblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(checkIfValid(str));
		

	}
	static boolean checkIfValid(String s) {
		Stack<Character> stk = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
				stk.push(s.charAt(i));
			}
			else {
				if(stk.isEmpty()) {
					return false;
				}
				else if(stk.peek()=='(' && s.charAt(i)==')') {
					stk.pop();
				}
				else if(stk.peek()=='{' && s.charAt(i)=='}') {
					stk.pop();
				}
				else if(stk.peek()=='[' && s.charAt(i)==']') {
					stk.pop();
				}
			}
		}
		return stk.isEmpty();
	}

}
