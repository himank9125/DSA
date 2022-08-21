package prc21Aug;

import java.util.Stack;

public class Temperature {

	public static void main(String[] args) {
		int[] temperature= {40,41,42,39,35,33,32,50,52,49,41};
		int[] res=new int[temperature.length];
		Stack<Integer> stk=new Stack<>();
		stk.push(0);
		for(int i=1;i<temperature.length;i++) {
			while(!stk.isEmpty()) {
				if(temperature[stk.peek()]<temperature[i]) {
					res[stk.peek()]=i-stk.peek();
					stk.pop();
				}
				else {
					break;
				}
			}
			stk.push(i);
		}
		for(int i:res) {
			System.out.print(i+" ");
		}
	}

}
