package june2022;

import java.util.Scanner;

public class RecursionPrint1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		result(N,1);

	}
	public static int result(int N,int i) {
		if(i>N) {
			return 0;
		}
		System.out.print(i+" ");
		return result(N,i+1);
	}

}
