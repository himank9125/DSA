package june2022;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print(sumOfnTerm(num));

	}
	public static int sumOfnTerm(int N) {
		if (N<1) {
			return 0;
		}
		return N+sumOfnTerm(N-1);
	}

}
