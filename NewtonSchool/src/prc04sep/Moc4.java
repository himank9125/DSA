package prc04sep;

import java.util.Scanner;
import java.util.Stack;

public class Moc4 {

	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<>();
		Stack<Integer> st=new Stack<>();
		Scanner sc=new Scanner(System.in);
		for(int x=0;x<3;x++) {
			stk.push(sc.nextInt());
		}
		int i=stk.size();
		while(i-->0) {
			st.push(stk.pop());
		}
		i=st.size();
		while(i-->0) {
			System.out.print(st.pop()+" ");
		}

	}

}
