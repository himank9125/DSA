package june2022;

import java.util.Scanner;

public class RecursionPalendrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.print(result(str,0,str.length()-1));
		
		// TODO Auto-generated method stub

	}
	public static boolean result(String str,int start, int end) {
		if(start>end) {
			return true;
		}
		if(str.charAt(start)==str.charAt(end)) {
		return result(str,start+1,end-1);
		}
		return false;
	}

}
