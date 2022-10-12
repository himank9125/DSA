package prc02sep;

import java.util.Stack;

public class Moc2 {

	public static void main(String[] args) {
		String str="0101";
		Stack<Character> stk=new Stack<>();
		stk.push(str.charAt(0));
		int count=0;
		for(int i=1;i<str.length();i++) {
			if(stk.peek()==str.charAt(i)) {
				stk.push(str.charAt(i));
			}
			else {
				int x=stk.size();
				while(x-->0 && i<str.length()) {
					if(stk.peek()!=str.charAt(i)) {
						stk.pop();
						i++;
					}
					else {
						break;
					}
				}
			}
			if(stk.size()==0) {
				count++;
				stk.clear();
			}
		}

	}

}
