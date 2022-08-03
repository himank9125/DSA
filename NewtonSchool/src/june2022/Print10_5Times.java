package june2022;

import java.util.Scanner;

public class Print10_5Times {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int freq=sc.nextInt();
		printNum(num,freq);
		// TODO Auto-generated method stub

	}
	public static int printNum(int n, int i) {
		if(i<1) {
			return 0;
		}
		System.out.print(n+" ");
		return printNum(n,i-1);
	}

}
