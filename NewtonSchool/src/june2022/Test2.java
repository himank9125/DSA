//package june2022;
//
//public class Test2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

package june2022;

import java.util.Scanner;
 class jay{
	private int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		if(x<=20) {
			int sum=0;
			for(int i=0;i<=x;i++) {
				sum+=i;
			}
			this.x=sum;
		}
		else {
		this.x=x;
		}
	}

}

public class Test2 {
	//private int x=20;

	public static void main(String[] args) {
		int[] A= {2,5,12,55,15,74,23,14};
		//System.out.print(result(A));
		jay obj=new jay();
//		obj.x=95;
		obj.setX(10);
		System.out.print(obj.getX());
		
		
		

	}
	

}

/*
 * 
 * 
 * 
 *  
 */

