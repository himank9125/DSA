package may2022;

import java.util.Scanner;

public class StringLengthCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		//int T=sc.nextInt();
		//for(int i=0;i<T;i++){
			String myStr="abcdbbef";
			System.out.println(substringLength(myStr));
			//int x=myStr.length();
			//System.out.println(x);
		//}

	}
	
	public static int substringLength(String str){
		int count=0;
		int x=str.length();
		for(int i=0;i<x;i++){
			for(int j=i+1;j<x;j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;
				}
			}
		}
		return x-count;
	}
}


