package prc02sep;

import java.util.Stack;

public class Moc {

	public static void main(String[] args) {
		
		String str="001110";
		Stack<Character> stk=new Stack<>();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='0') {
				stk.push(str.charAt(i));
			}
			else {
				int j=stk.size();
				while(j-->0 && i<str.length()) {
					if(str.charAt(i)=='1') {
						stk.pop();
						i++;
					}
					else {
						break;
					}
				}
				if(stk.size()==0) {
					count++;
					stk.clear();
				}
			}
			
		}
		System.out.print(count);
	}

}
